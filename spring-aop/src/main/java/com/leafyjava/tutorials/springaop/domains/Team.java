package com.leafyjava.tutorials.springaop.domains;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Team {
    private String name;
    private int wins;
    private int gamePlayed;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(final int wins) {
        this.wins = wins;
    }

    public int getGamePlayed() {
        return gamePlayed;
    }

    public void setGamePlayed(final int gamePlayed) {
        this.gamePlayed = gamePlayed;
    }

    @Override
    public String toString() {
        return "Team{" +
            "name='" + name + '\'' +
            '}';
    }
}
