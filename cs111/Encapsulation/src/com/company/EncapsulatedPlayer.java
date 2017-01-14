package com.company;

/**
 * Created by collinboback on 1/4/17.
 */
public class EncapsulatedPlayer {

    private String name;
    private int healthPoints =100;
    private String weapon;

    public EncapsulatedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.healthPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.healthPoints = this.healthPoints - damage;
        if(this.healthPoints <=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return healthPoints;
    }
}
