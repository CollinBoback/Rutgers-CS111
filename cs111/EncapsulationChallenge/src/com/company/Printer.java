package com.company;

/**
 * Created by collinboback on 1/4/17.
 */
public class Printer {

    private int tonerLevel;
    private double pagesPrinted;
    private boolean isDuplex;


    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int toner){
        if(toner>=100){
            this.tonerLevel = 100;
        }else{
            this.tonerLevel = toner;
        }
    }


    public void print(double pagesOfPrintJob){
        if(this.isDuplex){
            this.pagesPrinted += Math.ceil(pagesOfPrintJob/2);
        }else{
            this.pagesPrinted += pagesOfPrintJob;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public double getPagesPrinted() {
        return pagesPrinted;

    }
}
