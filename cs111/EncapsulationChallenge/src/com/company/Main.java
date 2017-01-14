package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(100, false);
        printer.print(9);
        printer.print(10);
        System.out.println(printer.getPagesPrinted());

	// write your code here
    }
}
