package com.magicalarena.game;

/**
 * Represents a game in the Magical Arena.
 */

public class Game {
    private Player playerA;
    private Player playerB;

     /**
     * Constructs a new Game instance with the given players.
     * 
     * @param playerA The first player.
     * @param playerB The second player.
     */

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

     /**
     * Starts the game and manages the turns between players until one of them loses.
     */

    public void play() {
        // Determine initial attacker and defender
        Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;

        // Print initial game state

        System.out.println("\nGame Started\n"+
                        "\nPlayer A"+
                        "\nHealth: " + playerA.getHealth()+
                        "\nStrength: "+playerA.getStrength() + 
                        "\n\nPlayer B " + //
                        "\nHealth: " + playerA.getHealth()+
                        "\nStrength: "+playerA.getStrength());

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            
            int damage = attacker.attack(defender);
            System.out.println(attacker.getClass().getSimpleName() + " attacks " + defender.getClass().getSimpleName() + " for " + damage + " damage.");

            // Print health of players after attack
            if(playerA.getHealth()<0)
                System.out.println("\nPlayer A Health: 0");
            else
                System.out.println("\nPlayer A Health: " + playerA.getHealth());

            if(playerB.getHealth()<0)
                System.out.println("\nPlayer B Health: 0");
            else
            System.out.println("Player B Health: " + playerB.getHealth());

            // Add delay between turns
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Swap attacker and defender for next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (playerA.getHealth() <= 0) {
            System.out.println("\nPlayer B wins!");
        } else {
            System.out.println("\nPlayer A wins!");
        }
    }
}
