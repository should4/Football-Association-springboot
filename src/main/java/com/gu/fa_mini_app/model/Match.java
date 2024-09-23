package com.gu.fa_mini_app.model;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Match {
    private int matchId;
    private int team1Id;      // 主队ID
    private int team2Id;      // 客队ID
    private LocalDateTime matchDate;   // 比赛时间
    private String location;  // 比赛地点
    private String team1Jersey;  // 主队球衣颜色
    private String team2Jersey;  // 客队球衣颜色
    private int duration;     // 比赛时长 (分钟)
    private LocalDateTime endTime;  // 比赛结束时间
    private String liveScore;  // 比赛的实时比分
    private String status;     // 比赛状态 (如未开始、进行中、已结束)

        // Getters and Setters
        public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(int team1Id) {
        this.team1Id = team1Id;
    }

    public int getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(int team2Id) {
        this.team2Id = team2Id;
    }

    public LocalDateTime getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDateTime matchDate) {
        this.matchDate = matchDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTeam1Jersey() {
        return team1Jersey;
    }

    public void setTeam1Jersey(String team1Jersey) {
        this.team1Jersey = team1Jersey;
    }

    public String getTeam2Jersey() {
        return team2Jersey;
    }

    public void setTeam2Jersey(String team2Jersey) {
        this.team2Jersey = team2Jersey;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getLiveScore() {
        return liveScore;
    }

    public void setLiveScore(String liveScore) {
        this.liveScore = liveScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
