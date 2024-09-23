package com.gu.fa_mini_app.controller;

import com.gu.fa_mini_app.model.Team;
import com.gu.fa_mini_app.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    // 获取所有球队
    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    // 根据ID获取球队
    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable int id) {
        return teamService.getTeamById(id);
    }

    // 添加新球队
    @PostMapping
    public int addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }
}
