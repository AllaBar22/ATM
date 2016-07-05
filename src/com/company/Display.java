package com.company;


public interface Display {
    String getPin();

    int getSelection();

    int getAmount();

    void notEnoughMessage();

    void wrongPinMessage();

    void showInputAmount();

    void showSum(int sum);

    void showOperations();

}
