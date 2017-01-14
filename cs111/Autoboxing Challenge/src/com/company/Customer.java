package com.company;

import java.util.ArrayList;

/**
 * Created by collinboback on 1/13/17.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);

    }

    public void addTransaction(double amount) {

        this.transactions.add(amount);

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
