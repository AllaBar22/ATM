package com.company.impl;

import com.company.Display;

import java.util.Scanner;

public class DisplayImpl implements Display {
    @Override
    public String getPin() {
        System.out.println("Enter pin code");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    @Override
    public void wrongPinMessage() {

        System.out.println("Wrong pin code");
    }

    @Override
    public void notEnoughMessage() {

        System.out.println("Not enough money");
    }

    @Override
    public int getAmount() {
        System.out.println("Enter amount");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void showSum(int sum) {
        System.out.println("Amount: "+sum);
    }

    @Override
    public int getSelection() {
        System.out.println("Select number of operations");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void showOperations() {
        System.out.println("1 - Withdraw\n2 - Input money\n3 - Account information");
    }

    @Override
    public void showInputAmount() {
        System.out.println("Amount: ");
    }
}
