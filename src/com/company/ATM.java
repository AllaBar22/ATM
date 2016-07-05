package com.company;

public class ATM {
    CardReader cardReader;
    DisplayMessage displayMessage;
    Display display;
    Input input;
    Output output;
    ServerConnection serverConnection;

    public void insertCard() {
        cardReader.getCardData();
    }

    public boolean checkPin(){
        String inputPin = displayMessage.getPin();
        String cardPin = cardReader.getPin();
        if(inputPin.equals(cardPin)){
            return  true;
        }
        else return false;
    }

    public int selectOption() {
        return display.getSelection();
    }

    public void selectWithDrowl() {
        displayMessage.getSelection();
    }

    public int selectWithDrowlAmount() {
        return displayMessage.getAmount();
    }

    public boolean checkSum() {
        int accountSum = serverConnection.checkSum();
        if (accountSum > selectWithDrowlAmount()) {
            return true;
        }else return false;
    }

    public void withDrowl() {
        output.giveMoney();
    }

    public void notEnough() {
        displayMessage.notEnoughMessage();
    }

    public void wrongPin() {
        displayMessage.wrongPinMessage();
    }

    public void showSum(){
        int sum = serverConnection.getSum();
        display.showSum(sum);
    }

    public void showOptions() {
        displayMessage.showOperations();

    }
}
