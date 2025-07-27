//                                              "જય શ્રી ગણેશ"

/*
    Ques : This file covers, Coupling.
*/

package com.springFramework.learn_spring_framework.game;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        System.out.println("\nRadhaKrishna\n");

//         var game = new MarioGame();
//         var game = new SuperContraGame();
         var game = new PacmanGame(); // 1. Object Creation

         var gameRunner = new GameRunner(game); // 2. Object Creation + Wiring of Dependencies
        // Dependency Injection : Passing the object of the class to the constructor of the class
        // Here, Game is the dependency of GameRunner class
        // We are injecting the dependency of GameRunner class using the constructor
        // Game -> GameRunner : Dependency Injection
         gameRunner.runGame();

         /*
          Instead of creating the object, managing the object, Wiring the object,
          and destroying the object, we can use "Spring Framework"
         */
    }
}
