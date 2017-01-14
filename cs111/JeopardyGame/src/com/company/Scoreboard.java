package com.company;

/**
 * Created by collinboback on 12/17/16.
 */
public class Scoreboard {

    private int score;

    public void changeScore(int change){
        if(change>0){
            this.score+=change;
            System.out.println("Congrats! You just won $"+change+"!");
        }else if(change<0){
            this.score+=change;
            System.out.println("Sorry, you just lost $"+Math.abs(change)+"!");
        }
    }
}
