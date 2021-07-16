package com.yimin.bank;

public interface InterfaceDAO<T> {
    void addUser();
    void updateName(T t, String newName);
    void updateEmail(T t, String newEmail);
    void updatePhone(T t, String newPhone);
    void deleteUser(String accountNumber);
    void displayAllUsers();
    T getUser(String name);
    void depositMoney(T t);
    void displayBalance(T t);
    void displayDetails(T t);

}
