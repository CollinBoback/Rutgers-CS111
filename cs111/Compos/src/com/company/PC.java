package com.company;

/**
 * Created by collinboback on 1/2/17.
 */
public class PC {

    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;


    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics :)
        System.out.println("PC.drawLogo(): called");
        monitor.drawPixelAt(1,1,"yellow");

    }


}
