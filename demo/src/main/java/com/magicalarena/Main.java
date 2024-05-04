package com.magicalarena;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.magicalarena.game.Game;
import com.magicalarena.game.Player;

public class Main {
    public static void main(String[] args) {
        
        configureLogger();
        Player playerA = new Player("A",50, 5, 10);
        Player playerB = new Player("B",100, 10, 5);

        Game game = new Game(playerA, playerB);
        game.play();
    }

    
    private static void configureLogger() {
        Logger rootLogger = Logger.getLogger("");
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        rootLogger.addHandler(consoleHandler);
        rootLogger.setLevel(Level.INFO);
    }
}
