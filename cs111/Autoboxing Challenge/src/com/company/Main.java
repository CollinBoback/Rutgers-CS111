package com.company;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank("Chase");

        bank.addBranch("Toms River");
        bank.addBranch("Brick");

        bank.addCustomer("Toms River", "Collin", 1000.00);
        bank.addCustomer("Toms River", "Percy", 220.12);
        bank.addCustomer("Toms River", "Adam", 200.00);
        bank.addCustomer("Brick", "Courtney", 150.52);

        bank.addCustomerTransaction("Toms River", "Collin", 200.00);
        bank.addCustomerTransaction("Toms River", "Adam", 20.00);
        bank.addCustomerTransaction("Toms River", "Percy", 200.00);

        bank.listCustomers("Toms River", true);
        System.out.println("----------");
        bank.listCustomers("Brick", true);




    }
}
