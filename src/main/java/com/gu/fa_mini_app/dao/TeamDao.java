package com.gu.fa_mini_app.dao;


import com.gu.fa_mini_app.model.Team;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TeamDao {

    private final JdbcTemplate jdbcTemplate;

    public TeamDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 查询所有球队
    public List<Team> getAllTeams() {
        String sql = "SELECT * FROM teams";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Team team = new Team();
            team.setTeamId(rs.getInt("team_id"));
            team.setTeamName(rs.getString("team_name"));
            team.setAcademyName(rs.getString("academy_name"));
            team.setCoachName(rs.getString("coach_name"));
            return team;
        });
    }

    // 根据ID查询球队
    public Team getTeamById(int teamId) {
        String sql = "SELECT * FROM teams WHERE team_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{teamId}, (rs, rowNum) -> {
            Team team = new Team();
            team.setTeamId(rs.getInt("team_id"));
            team.setTeamName(rs.getString("team_name"));
            team.setAcademyName(rs.getString("academy_name"));
            team.setCoachName(rs.getString("coach_name"));
            return team;
        });
    }

    // 添加新球队
    public int addTeam(Team team) {
        String sql = "INSERT INTO teams (team_name, academy_name, coach_name) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, team.getTeamName(), team.getAcademyName(), team.getCoachName());
    }
}
