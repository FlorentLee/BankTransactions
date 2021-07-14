package com.yimin.bank;

public class Bank_Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Bank_Account() {
        this("123456789", 50.0, "Default Name", "Default Email", "Default Phone Number");
        System.out.println("Default Information:");
    }

    public Bank_Account(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Your deposit of " + depositAmount + " succeeded! The current balance is " + this.balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Failed transaction!");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Your withdraw of " + withdrawAmount + " succeeded! The current balance is " + this.balance);
        }
    }

}