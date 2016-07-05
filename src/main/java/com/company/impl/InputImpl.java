package com.company.impl;

import com.company.Input;

/**
 * Created by alla.baranova on 7/5/2016.
 */
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
