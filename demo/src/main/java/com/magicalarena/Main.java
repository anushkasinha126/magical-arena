package com.magicalarena;


import com.magicalarena.game.Game;
import com.magicalarena.game.Player;

/**
 * Main class to start the Magical Arena game.
 */


public class Main {

    /**
     * Main method to start the game.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create players
        Player playerA = new Player("A",50, 5, 10);
        Player playerB = new Player("B",100, 10, 5);

        // Create a game instance and start playing
        Game game = new Game(playerA, playerB);
        game.play();
    }


}
