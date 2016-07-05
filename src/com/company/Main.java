package com.company;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.insertCard();
        boolean pinOk = atm.checkPin();
        if(pinOk){
            atm.selectWithDrowl();
            atm.selectWithDrowlAmount();
            boolean sumOk = atm.checkSum();
            if(sumOk){
                atm.withDrowl();
            }else{
                atm.notEnough();
            }
        }else {
            atm.wrongPin();
        }

    }
}
