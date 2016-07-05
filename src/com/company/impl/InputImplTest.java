package com.company.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputImplTest {

    @Test
    public void testTakeMoney() throws Exception {
        InputImpl input = new InputImpl();
        assertTrue(input.takeMoney());
    }

    @Test
    public void testCountMoney() throws Exception {
        InputImpl input = new InputImpl();
        assertEquals(200,input.countMoney());
    }
}