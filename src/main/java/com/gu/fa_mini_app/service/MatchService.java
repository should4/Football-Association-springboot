package com.gu.fa_mini_app.service;

import com.gu.fa_mini_app.dao.MatchDao;
import com.gu.fa_mini_app.model.Match;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    private final MatchDao matchDao;

    public MatchService(MatchDao matchDao) {
        this.matchDao = matchDao;
    }

    // 获取所有比赛
    public List<Match> getAllMatches() {
        return matchDao.getAllMatches();
    }

    // 根据ID获取比赛
    public Match getMatchById(int matchId) {
        return matchDao.getMatchById(matchId);
    }

    // 添加新比赛
    public int addMatch(Match match) {
        return matchDao.addMatch(match);
    }

    // 更新比赛信息
    public int updateMatch(Match match) {
        return matchDao.updateMatch(match);
    }

    // 删除比赛
    public int deleteMatch(int matchId) {
        return matchDao.deleteMatch(matchId);
    }
}
