package com.company;

import java.util.Enumeration;

/**
 * Created by alla.baranova on 7/5/2016.
 */
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
