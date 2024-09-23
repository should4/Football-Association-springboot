package com.gu.fa_mini_app.dao;

import com.gu.fa_mini_app.model.Match;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class MatchDao {

    private final JdbcTemplate jdbcTemplate;

    public MatchDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 1. 查询所有比赛
    public List<Match> getAllMatches() {
        String sql = "SELECT * FROM matches";
        return jdbcTemplate.query(sql, this::mapRowToMatch);
    }

    // 2. 根据ID查询比赛
    public Match getMatchById(int matchId) {
        String sql = "SELECT * FROM matches WHERE match_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{matchId}, this::mapRowToMatch);
    }

    // 3. 添加新比赛
    public int addMatch(Match match) {
        String sql = "INSERT INTO matches (team1_id, team2_id, match_date, location, team1_jersey, team2_jersey, duration, end_time, live_score, status) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, match.getTeam1Id(), match.getTeam2Id(), match.getMatchDate(), match.getLocation(),
                match.getTeam1Jersey(), match.getTeam2Jersey(), match.getDuration(), match.getEndTime(),
                match.getLiveScore(), match.getStatus());
    }

    // 4. 更新比赛信息
    public int updateMatch(Match match) {
        String sql = "UPDATE matches SET team1_id = ?, team2_id = ?, match_date = ?, location = ?, " +
                "team1_jersey = ?, team2_jersey = ?, duration = ?, end_time = ?, live_score = ?, status = ? " +
                "WHERE match_id = ?";
        return jdbcTemplate.update(sql, match.getTeam1Id(), match.getTeam2Id(), match.getMatchDate(),
                match.getLocation(), match.getTeam1Jersey(), match.getTeam2Jersey(), match.getDuration(),
                match.getEndTime(), match.getLiveScore(), match.getStatus(), match.getMatchId());
    }

    // 5. 删除比赛
    public int deleteMatch(int matchId) {
        String sql = "DELETE FROM matches WHERE match_id = ?";
        return jdbcTemplate.update(sql, matchId);
    }

    // 将数据库行映射到 Match 对象
    private Match mapRowToMatch(ResultSet rs, int rowNum) throws SQLException {
        Match match = new Match();
        match.setMatchId(rs.getInt("match_id"));
        match.setTeam1Id(rs.getInt("team1_id"));
        match.setTeam2Id(rs.getInt("team2_id"));
        match.setMatchDate(rs.getObject("match_date", LocalDateTime.class));
        match.setLocation(rs.getString("location"));
        match.setTeam1Jersey(rs.getString("team1_jersey"));
        match.setTeam2Jersey(rs.getString("team2_jersey"));
        match.setDuration(rs.getInt("duration"));
        match.setEndTime(rs.getObject("end_time", LocalDateTime.class));
        match.setLiveScore(rs.getString("live_score"));
        match.setStatus(rs.getString("status"));
        return match;
    }
}

