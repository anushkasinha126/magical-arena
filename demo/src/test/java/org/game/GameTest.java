package org.game;

import org.junit.jupiter.api.Test;

import com.magicalarena.game.Game;
import com.magicalarena.game.Player;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Game class.
 */

public class GameTest {

    private Player playerA;
    private Player playerB;
    private Game game;

    /**
     * Method to set up the test environment before each test case.
     */
    @BeforeEach
    public void setup() {
        playerA = new Player("A", 50, 5, 10);
        playerB = new Player("B", 100, 10, 5);
        game = new Game(playerA, playerB);
    }

    /**
     * Test case to verify player attack functionality.
     */
    @Test
    public void testPlayerAttack() {
        int initialHealth = playerB.getHealth();
        playerA.attack(playerB);
        assertTrue(initialHealth > playerB.getHealth());
    }

    /**
     * Test case to verify player defend functionality.
     */
    @Test
    public void testPlayerDefend() {
        int initialHealth = playerA.getHealth();
        playerB.attack(playerA);
        assertTrue(initialHealth > playerA.getHealth());
    }

    /**
     * Test case to verify the outcome of the game when player A wins.
     */
    @Test
    public void testGameOutcomePlayerAWins() {
        playerB.setHealth(10); // Set player B's health to a low value
        game.play();
        assertTrue(playerA.getHealth() > 0);
        assertTrue(playerB.getHealth() <= 0);
    }

    /**
     * Test case to verify the outcome of the game when player B wins.
     */
    @Test
    public void testGameOutcomePlayerBWins() {
        playerA.setHealth(10); // Set player A's health to a low value
        game.play();
        assertTrue(playerA.getHealth() <= 0);
        assertTrue(playerB.getHealth() > 0);
    }
}
