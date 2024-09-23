package com.gu.fa_mini_app.service;

import com.gu.fa_mini_app.dao.TeamDao;
import com.gu.fa_mini_app.model.Team;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeamService {

    private final TeamDao teamDao;

    public TeamService(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public List<Team> getAllTeams() {
        return teamDao.getAllTeams();
    }

    public Team getTeamById(int teamId) {
        return teamDao.getTeamById(teamId);
    }

    public int addTeam(Team team) {
        return teamDao.addTeam(team);
    }
}
