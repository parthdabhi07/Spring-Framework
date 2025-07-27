package com.springFramework.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("marioQualifier")
public class MarioGame implements GamingConsole {

    // four buttons in the game
    // up, down, left, right
    // jump, Go into a hole, Go Back, Accelerate

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Accelerate");
    }

    public String getGameName() {
        return "Mario Game";
    }
}
