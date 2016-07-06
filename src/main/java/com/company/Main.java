package com.company;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ATMModule());
        ATM atm = injector.getInstance(ATM.class);
        atm.insertCard();
        boolean pinOk = atm.checkPin();
        if (pinOk) {
            atm.showOptions();
            int operationID = atm.selectOption();

            switch (operationID) {
                case 1:
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
                    atm.selectMoneyInput();
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
