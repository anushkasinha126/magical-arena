package com.magicalarena.game;


/**
 * Represents a player in the Magical Arena game.
 */

public class Player {
    private String name;

    private int health;
    private int strength;
    private int attack;
    private Dice dice;
   
/**
     * Constructs a new Player instance with the given attributes.
     * 
     * @param name     The name of the player.
     * @param health   The initial health of the player.
     * @param strength The strength of the player.
     * @param attack   The attack power of the player.
     */

    public Player(String name, int health, int strength, int attack) {
        this.name=name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.dice = new Dice();
    }

    /**
     * Retrieves the name of the player.
     * 
     * @return The name of the player.
     */

    public String getName(){
        return name;
    }

    /**
     * Sets the name of the player.
     * 
     * @param name The name to set for the player.
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * Retrieves the health of the player.
     * 
     * @return The health of the player.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health of the player.
     * 
     * @param health The health to set for the player.
     */

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Retrieves the strength of the player.
     * 
     * @return The strength of the player.
     */

    public int getStrength() {
        return strength;
    }

    /**
     * Retrieves the attack power of the player.
     * 
     * @return The attack power of the player.
     */

    public int getAttack() {
        return attack;
    }

    /**
     * Defends against an attack, reducing health accordingly.
     * 
     * @param damage The damage to be defended against.
     */    

    public void defend(int damage) {
        int damageTaken = damage - (strength * dice.roll());

        if (damageTaken > 0) {
            health -= damageTaken;
            System.out.println("\nPlayer "+name+" health reduce to " + health);
        }
        else{
            System.out.println("\nPlayer "+name+" successfully defended the attack.");
        }
    }

    /**
     * Attacks an opponent, causing damage based on attack power and dice roll.
     * 
     * @param opponent The player to be attacked.
     * @return The damage caused to the opponent.
     */

    public int attack(Player opponent) {
        int damage = attack * dice.roll();
       
        opponent.defend(damage);
        System.out.println("\nAttacker caused " + damage + " damage to the Player "+name);
        return damage;
    }

}
