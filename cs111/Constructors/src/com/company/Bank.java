package com.company;

/**
 * Created by collinboback on 12/2/16.
 */
public class Bank {


    private double balance;
    private int accountNumber;
    private String customer;
    private String email;
    private String phoneNumber;


    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public double getBalance(){
        return this.balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;

    }

    public String getCustomer(){
        return this.customer;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void makeDeposit(double deposit){
        this.balance+=deposit;

    }

    public void makeWithdrawal(double withdrawal){
        if(this.balance>=withdrawal){
            this.balance-=withdrawal;
        }else{
            System.out.println("Insufficient funds. Your balance available is " + this.balance);
        }
    }

    public Bank(double balance) {
        this.balance = balance;
    }
}
