package com.company;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.insertCard();
        boolean pinOk = atm.checkPin();
        if (pinOk) {
            atm.showOptions();
            int operationID = atm.selectOption();

            switch (operationID) {
                case 1:
                    //atm.selectWithDrowl();
                    atm.selectWithDrowlAmount();
                    boolean sumOk = atm.checkSum();
                            if (sumOk) {
                                atm.withDrowl();
                                atm.changeSumAmount();
                            } else {
                                atm.notEnough();
                            }
                                    break;

                case 2:
                    //atm.selectMoneyInput();
                    atm.moneyInput();
                    atm.checkAmount();
                    atm.showAmount();
                    atm.changeSumAmount();

                                    break;

                case 3:
                    atm.showSum();

                                    break;

                default:
                    System.out.println("Place for Wrong input and relocation");
                                    break;
            }


        } else {
            atm.wrongPin();
        }

    }


}
