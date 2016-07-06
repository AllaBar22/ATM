package com.company;

import javax.inject.Inject;
import java.util.Scanner;

public class ATM {
    @Inject
    CardReader cardReaderImpl;
    @Inject
    Display display;
    @Inject
    Input input;
    @Inject
    Output output;
    @Inject
    ServerConnection serverConnection;



    public void insertCard() {
        cardReaderImpl.getCardData();
        serverConnection.getAccount();
    }

    public boolean checkPin(){
        String inputPin = display.getPin();
        String cardPin = cardReaderImpl.getPin();
        if (inputPin.equals(cardPin)) {
            return true;
        } else return false;
    }

    public int selectOption() {
        return display.getSelection();
    }

//    public void selectWithDrowl() {
//        display.getSelection();
//    }
//
//    public void selectMoneyInput() {
//        display.getSelection();
//    }

    public void moneyInput() {
        input.takeMoney();
    }

    public int checkAmount() {
        return input.countMoney();
    }

    public void showAmount() {
        display.showInputAmount();
    }

    public void selectWithDrowlAmount() {
         display.getAmount();
    }

    public boolean checkSum() {
        int accountSum = serverConnection.checkSum();
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (accountSum > amount ) {
            return true;
        } else return false;
    }

    public void withDrowl() {
        output.giveMoney();
    }

    public void notEnough() {
        display.notEnoughMessage();
    }

    public void changeSumAmount() {
        serverConnection.changeAccountSum(checkAmount());
    }

    public void wrongPin() {
        display.wrongPinMessage();
    }

    public void showSum(){
        int sum = serverConnection.getSum();
        display.showSum(sum);
    }

    public void showOptions() {
        display.showOperations();
    }
}
