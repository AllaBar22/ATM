package com.company.impl;

import com.company.Input;

public class InputImpl implements Input {
    @Override
    public boolean takeMoney() {
        return true;
    }

    @Override
    public int countMoney() {
        return 200;
    }
}
