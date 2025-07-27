package com.springFramework.learn_spring_framework.game;

public interface GamingConsole {

    // four buttons in the game
    // up, down, left, right
    // jump, Go into a hole, Go Back, Accelerate

    public void up();

    public void down();

    public void left();

    public void right();

    public String getGameName();
}
