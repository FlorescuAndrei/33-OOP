package com.andrei.constructor;

public class Account {
    private String number;
    private double balance;
    private String customerName;


   //constructor can be overloaded


    public Account(String number, double balance, String customerName){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;

        System.out.println("Account constructor with parameters called");

    }

    //create the account with default values
    public Account(){
        //"this" is calling the previous  constructor
        // call to this must be the first line in constructor
        this("56789", 2.50, "Default name");

        System.out.println("Empty constructor called");

    }

    public Account(double balance, String customerName) {
        this("99999", balance, customerName);

        System.out.println("third constructor called");
    }

    public Account(String number){
        this.number = number;
        System.out.println("fourth constructor called");
    }


    public String getNumber() {
        return number;
    }


    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

}


