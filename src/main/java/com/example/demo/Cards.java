package com.example.demo;

import java.util.ArrayList;

public class Cards {
    private ArrayList<Item> cards = new ArrayList<>();

    public ArrayList<Item> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Item> cards) {
        this.cards = cards;
    }

    public void setItem(Item item){
        this.cards.add(item);
    }
}
