package com.company;

import java.util.Enumeration;

/**
 * Created by alla.baranova on 7/5/2016.
 */
public interface Display {
    String getPin();

    void getSelection();

    int getAmount();

    void notEnoughMessage();

    void wrongPinMessage();
}
