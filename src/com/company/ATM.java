package com.company;

public class ATM {
    CardReader cardReader;
    DisplayMessage displayMessage;
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
}
