package com.gu.fa_mini_app.model;

public class Team {
    private int teamId;
    private String teamName;
    private String academyName;
    private String coachName;

    // Getters and Setters
    public int getTeamId() { return teamId; }
    public void setTeamId(int teamId) { this.teamId = teamId; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public String getAcademyName() { return academyName; }
    public void setAcademyName(String academyName) { this.academyName = academyName; }

    public String getCoachName() { return coachName; }
    public void setCoachName(String coachName) { this.coachName = coachName; }
}
