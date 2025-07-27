package com.springFramework.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class GameRunner {

    // Here, GameRunner is tightly coupled with MarioGame
    // If we want to run SuperContraGame, we need to change the code in GameRunner
    // This is not a good practice
//    private MarioGame game;

    // To avoid this, we can use the interface
    // Now, GameRunner is not tightly coupled with MarioGame, it is "loosely coupled"
    // We can run any game by passing the object of that game
    private GamingConsole game;

    public GameRunner(@Qualifier("marioQualifier")GamingConsole game) {
        this.game = game;
    }

    public void runGame() {
        System.out.println("Running Game..." + game.getGameName());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}