package com.magicalarena.game;

import java.util.Random;

/**
 * Represents a dice for rolling in the Magical Arena game.
 */

public class Dice {
    private Random random;

     /**
     * Constructs a new Dice instance.
     */

    public Dice() {
        this.random = new Random();
    }

     /**
     * Rolls the dice and returns the result.
     * 
     * @return The result of the dice roll, a random integer between 1 and 6 (inclusive).
     */

    public int roll() {
        return random.nextInt(6) + 1; 
    }
}