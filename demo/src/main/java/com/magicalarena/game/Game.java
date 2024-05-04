package com.magicalarena.game;

public class Game {
    private Player playerA;
    private Player playerB;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void play() {
        Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;
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

            System.out.println("\nPlayer A Health: " + playerA.getHealth());
            System.out.println("Player B Health: " + playerB.getHealth());

            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (playerA.getHealth() <= 0) {
            System.out.println("Player B wins!");
        } else {
            System.out.println("Player A wins!");
        }
    }
}
