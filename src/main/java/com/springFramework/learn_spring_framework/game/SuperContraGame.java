package com.springFramework.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {

    // four buttons in the game
    // up, down, left, right

    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Sit Down");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Shoot Bullet");
    }

    public String getGameName() {
        return "Super Contra Game";
    }
}