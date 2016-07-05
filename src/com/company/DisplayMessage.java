package com.company;

/**
 * Created by alla.baranova on 7/5/2016.
 */
public class DisplayMessage implements Display{
    @Override
    public String getPin() {
        return "0000";
    }

    @Override
    public void wrongPinMessage() {

    }

    @Override
    public void notEnoughMessage() {

    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public void getSelection() {

    }
}
