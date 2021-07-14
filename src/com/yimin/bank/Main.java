package com.yimin.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank_Account defaultAccount = new Bank_Account();

        System.out.println(defaultAccount.getAccountNumber());
        System.out.println(defaultAccount.getBalance());
        System.out.println(defaultAccount.getCustomerName());
        System.out.println(defaultAccount.getCustomerEmail());
        System.out.println(defaultAccount.getCustomerPhoneNumber());

        System.out.print("Please enter your Account Number: ");
        String accountNumber = new Scanner(System.in).nextLine();

        System.out.print("Please enter your Balance: ");
        double balance = new Scanner(System.in).nextDouble();

        System.out.print("Please enter your Name: ");
        String customerName = new Scanner(System.in).nextLine();

        System.out.print("Please enter your Email: ");
        String customerEmail = new Scanner(System.in).nextLine();

        System.out.print("Please enter your Phone Number: ");
        String customerPhoneNumber = new Scanner(System.in).nextLine();

        Bank_Account yourAccount = new Bank_Account(accountNumber, balance, customerName, customerEmail, customerPhoneNumber);

        System.out.println(yourAccount.getAccountNumber());
        System.out.println(yourAccount.getBalance());
        System.out.println(yourAccount.getCustomerName());
        System.out.println(yourAccount.getCustomerEmail());
        System.out.println(yourAccount.getCustomerPhoneNumber());

        System.out.print("Please enter your Deposit Amount: ");
        double depositAmount = new Scanner(System.in).nextDouble();
        yourAccount.depositFunds(depositAmount);

        System.out.print("Please enter your Withdraw Amount: ");
        double withdrawAmount = new Scanner(System.in).nextDouble();
        yourAccount.withdrawFunds(withdrawAmount);
    }
}
