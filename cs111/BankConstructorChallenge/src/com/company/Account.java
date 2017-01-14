package com.company;

/**
 * Created by collinboback on 12/28/16.
 */
public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


    Account(int accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    Account() {

        this(0, 0, "Default Name", "Default Email", "Defaule Phone");



    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public void setCustomerPhone(String phone) {
        this.customerPhone = phone;
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void withdrawal(double withdrawal) {

        System.out.println("Your available balance is: " + balance);

        if (balance - withdrawal >= 0) {
            balance -= withdrawal;
            System.out.println("You have successfully withdrawn $" + withdrawal + ". Bal: $" + balance);
        } else {
            System.out.println("Insufficient Funds. Available balance is $" + balance);
        }


    }

    public void deposit(double deposit) {

        balance += deposit;

        System.out.println("Deposit of $" + deposit + " was successful. New Bal: $" + balance);
    }

    public void change(double balance) {

        double total = balance;

        int[] billsAndChange = new int[10];

        if (total % 100 >= 0) {

            billsAndChange[0] = (int)((total - (total % 100)) / 100);

            total -= (total - (total % 100));


        }

        if(total%50>=0){

            billsAndChange[1] = (int)((total - (total % 50)) / 50);

            total -= (total - (total % 50));

        }

        if(total%20>=0){

            billsAndChange[2] = (int)((total - (total % 20)) / 20);
            total -= (total - (total % 20));


        }

        if(total%10>=0){

            billsAndChange[3] = (int)((total - (total % 10)) / 10);



            total -= (int)(total - (total % 10));


        }

        if(total%5>=0){

            billsAndChange[4] = (int)((total - (total % 5)) / 5);

            total -= (total - (total % 5));


        }

        if(total%1>0){

            billsAndChange[5] = (int)((total - (total % 1)) / 1);

            total -= (total - (total % 1));


        }

        if(total%0.25>0){

            billsAndChange[6] = (int)((total - (total % 0.25)) / 0.25);

            total = (total % 0.25);

            System.out.println("bal after quarters: "+total);
            System.out.println("Expected bal after quarters: 16");



        }

        if(total%0.10>0){

            billsAndChange[7] = (int)((total - (total % 0.10)) / 0.10);

            total -= (total - (total % 0.10));


        }

        if(total%0.05>0){

            billsAndChange[8] = (int)((total - (total % 0.05)) / 0.05);

            total -= (total - (total % 0.05));


        }

        if(total%0.01>0){

            billsAndChange[9] = (int)((total - (total % 0.01)) / 0.01);

            total -= (total - (total % 0.01));


        }


        for(int i = 0; i<billsAndChange.length;i++){
            if(billsAndChange[i]>0){
                if(i==0){
                    System.out.println("Hundreds: "+billsAndChange[0]);
                }
                if(i==1){
                    System.out.println("Fifties: "+billsAndChange[1]);
                }
                if(i==2){
                    System.out.println("Twenties: "+billsAndChange[2]);
                }
                if(i==3){
                    System.out.println("Tens: "+billsAndChange[3]);
                }
                if(i==4){
                    System.out.println("Fives: "+billsAndChange[4]);
                }
                if(i==5){
                    System.out.println("Ones: "+billsAndChange[5]);
                }
                if(i==6){
                    System.out.println("Quarters: "+billsAndChange[6]);
                }
                if(i==7){
                    System.out.println("Dimes: "+billsAndChange[7]);
                }
                if(i==8){
                    System.out.println("Nickels: "+billsAndChange[8]);
                }
                if(i==9){
                    System.out.println("Pennies: "+billsAndChange[9]);
                }
            }
        }


    }


}
