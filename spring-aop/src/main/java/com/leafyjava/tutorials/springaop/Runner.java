package com.leafyjava.tutorials.springaop;

import com.leafyjava.tutorials.springaop.domains.Game;
import com.leafyjava.tutorials.springaop.domains.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private ApplicationContext context;

    @Autowired
    public Runner(final ApplicationContext applicationContext) {
        context = applicationContext;
    }

    @Override
    public void run(final String... strings) throws Exception {
        Team redsox = context.getBean(Team.class);
        redsox.setName("New England Red Sox");
        redsox.setWins(12);
        redsox.setGamePlayed(16);

        Team cubs = context.getBean(Team.class);
        cubs.setName("Chicago Cubs");
        cubs.setWins(10);
        cubs.setGamePlayed(18);

        Game game = context.getBean(Game.class);
        game.setTeams(redsox, cubs);
        game.setScore("11 - 10");

        System.out.println(game);

    }
}
