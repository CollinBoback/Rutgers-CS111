package com.company;

public class Main {

    public static void main(String[] args) {

        //NOT USING ENCAPSULATION

        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 20;
//        player.loseHealth(damage);
//        System.out.println("Health remaining: "+player.healthRemaining());

//        --------------------------------

        EncapsulatedPlayer player1 = new EncapsulatedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player1.getHealth());

    }


}
