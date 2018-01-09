package com.leafyjava.tutorials.springaop.domains;

import org.springframework.stereotype.Component;

@Component
public class Game {
    private String score;
    private Team[] teams;

    public String getScore() {
        return score;
    }

    public void setScore(final String score) {
        this.score = score;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(final Team team1, final Team team2) {
        this.teams = new Team[] {team1, team2};
    }

    @Override
    public String toString() {
        return "Game{" +
            "teams=" + teams[0].getName() + " - " + teams[1].getName()+
            ", score='" + score + '\'' +
            '}';
    }
}
