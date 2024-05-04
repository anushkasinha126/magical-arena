package com.magicalarena.game;


public class Player {
    private String name;

    private int health;
    private int strength;
    private int attack;
    private Dice dice;

    public Player(String name, int health, int strength, int attack) {
        this.name=name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.dice = new Dice();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }
    

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

    public int attack(Player opponent) {
        int damage = attack * dice.roll();
       
        opponent.defend(damage);
        System.out.println("\nAttacker caused " + damage + " damage to the Player "+name);
        return damage;
    }

}
