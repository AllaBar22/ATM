package com.company;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.insertCard();
        boolean pinOk = atm.checkPin();
        if (pinOk) {
            int operationID = atm.selectOption();

            switch (operationID) {
                case 1: atm.selectWithDrowl();
                atm.selectWithDrowlAmount();
                boolean sumOk = atm.checkSum();
                if (sumOk) {
                    atm.withDrowl();
                } else {
                    atm.notEnough();
                }
                break;
                case 2:
                    break;
                case 3:
                    break;

                default:
                    break;
            }


        } else {
            atm.wrongPin();
        }

    }


}
