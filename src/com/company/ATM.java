package com.company;

/**
 * Created by alla.baranova on 7/5/2016.
 */
public class ATM {
    CardReader cardReader;
    Display display;
    Input input;
    Output output;
    ServerConnection serverConnection;

    public void insertCard() {
        cardReader.getCardData();
    }

    public boolean checkPin(){
        String inputPin = display.getPin();
        String cardPin = cardReader.getPin();
        if(inputPin.equals(cardPin)){
            return  true;
        }
        else return false;
    }

    public void selectWithDrowl() {
        display.getSelection();
    }

    public int selectWithDrowlAmount() {
        return display.getAmount();
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
        display.notEnoughMessage();
    }

    public void wrongPin() {
        display.wrongPinMessage();
    }
}
