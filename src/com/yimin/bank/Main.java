package com.yimin.bank;

public class Main {
    public static void main(String[] args) {
        ArrayListDAO userDao = new ArrayListDAO();
        User user1 = userDao.getUser("David");
        userDao.displayDetails(user1);
        userDao.displayBalance(user1);
        userDao.updateName(user1, "Alex");
        userDao.updateEmail(user1, "Alex@domain.com");
        userDao.updatePhone(user1, "789");
        userDao.displayDetails(user1);
        userDao.depositMoney(user1);
        userDao.deleteUser("456");
        userDao.addUser();
        userDao.displayAllUsers();
    }
}