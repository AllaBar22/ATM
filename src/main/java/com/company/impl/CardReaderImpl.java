package com.company.impl;


import com.company.Card;
import com.company.CardReader;


public class CardReaderImpl implements CardReader {
Card card = new Card();
    @Override
    public String getPin() {
        card.setPin("1234");
        return card.getPin();
    }


    @Override
    public void getCardData() {
        card.setPin("1234");
        card.setCardId(1);
        card.getCardId();

    }
}
