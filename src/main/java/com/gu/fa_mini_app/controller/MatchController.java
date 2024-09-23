package com.gu.fa_mini_app.controller;

import com.gu.fa_mini_app.model.Match;
import com.gu.fa_mini_app.service.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    // 获取所有比赛
    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    // 根据ID获取比赛
    @GetMapping("/{id}")
    public Match getMatchById(@PathVariable int id) {
        return matchService.getMatchById(id);
    }

    // 添加新比赛
    @PostMapping
    public int addMatch(@RequestBody Match match) {
        return matchService.addMatch(match);
    }

    // 更新比赛信息
    @PutMapping("/{id}")
    public int updateMatch(@PathVariable int id, @RequestBody Match match) {
        match.setMatchId(id);
        return matchService.updateMatch(match);
    }

    // 删除比赛
    @DeleteMapping("/{id}")
    public int deleteMatch(@PathVariable int id) {
        return matchService.deleteMatch(id);
    }
}
