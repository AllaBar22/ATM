package com.company;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by alla.baranova on 7/5/2016.
 */
public class DisplayMessage implements Display{
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
    public int getSelection() {
        System.out.println("Select number of operation");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void showSum(int sum) {
        System.out.println("Account: "+ sum);
    }

    @Override
    public void showOperations() {
        System.out.println("1 - Withdraw\n2 - Input money\n3 - Account information");
    }
}
