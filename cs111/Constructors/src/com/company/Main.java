package com.company;

public class Main {

    public static void main(String[] args) {

        Bank Chase = new Bank();


        Chase.setAccountNumber(10001);
        Chase.setCustomer("Collin");
        Chase.setBalance(1000.50);
        Chase.setEmail("collin.boback@aol.com");
        Chase.setPhoneNumber("732-914-0952");


        System.out.println(Chase.getBalance());

        Chase.makeDeposit(100.00);

        System.out.println(Chase.getBalance());

        Chase.makeWithdrawal(2000.00);

        System.out.println(Chase.getBalance());


    }
}
