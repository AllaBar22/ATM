package com.company.impl;


import com.company.Card;
import com.company.CardReader;


public class CardReaderImpl implements CardReader {

    @Override
    public String getPin() {
        Card card  = new Card();
        return card.getPin();
    }


    @Override
    public void getCardData() {
        Card card = new Card();
        card.getCardId();
        card.getFirstName();
        card.getLastName();
    }
}
