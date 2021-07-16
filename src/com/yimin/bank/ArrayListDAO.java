package com.yimin.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDAO implements InterfaceDAO<User>{

    ArrayList<User> users = new ArrayList<>();

    public ArrayListDAO() {
        users.add(new User("123",100,"David","David@domain.com","123"));
        users.add(new User("456",200,"Simon","Simon@domain.com","456"));
    }

    @Override
    public void addUser() {
        System.out.print("Please enter your Account Number: ");
        String accountNumber = new Scanner(System.in).nextLine();
        System.out.print("Please enter your Name: ");
        String customerName = new Scanner(System.in).nextLine();
        System.out.print("Please enter your Email: ");
        String customerEmail = new Scanner(System.in).nextLine();
        System.out.print("Please enter your Phone Number: ");
        String customerPhoneNumber = new Scanner(System.in).nextLine();
        users.add(new User(accountNumber, 0.0, customerName, customerEmail, customerPhoneNumber));
    }

    @Override
    public User getUser(String name) {
        for (User user : users) {
            if(user.getCustomerName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void displayDetails(User user) {
        System.out.println(user.getAccountNumber());
        System.out.println(user.getCustomerName());
        System.out.println(user.getCustomerEmail());
        System.out.println(user.getCustomerPhoneNumber());
    }

    @Override
    public void displayAllUsers() {
        for (User user : users) {
            System.out.println(user.getCustomerName());
        }
    }

    @Override
    public void updateName(User user, String newName) {
        user.setCustomerName(newName);
    }

    @Override
    public void updateEmail(User user, String newEmail) {
        user.setCustomerEmail(newEmail);
    }

    @Override
    public void updatePhone(User user, String newPhone) {
        user.setCustomerPhoneNumber(newPhone);
    }

    @Override
    public void deleteUser(String accountNumber) {
        users.removeIf(user -> user.getAccountNumber().equals(accountNumber));
    }

    @Override
    public void depositMoney(User user) {
        System.out.print("Please enter your Deposit Amount: ");
        user.depositFunds(new Scanner(System.in).nextDouble());
    }

    @Override
    public void displayBalance(User user) {
        System.out.println(user.getBalance());
    }

}
