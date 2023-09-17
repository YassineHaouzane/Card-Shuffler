package com.yassine.haouzane.cardgame.model.card;

import lombok.Getter;

public class Card implements Comparable<Card> {
    @Getter
    private final Type type;
    @Getter
    private final CardValue value;


    public Card(Type type, CardValue value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public int compareTo(Card compared) {
        int currentValue = this.value.getWeight();
        int comparedValue = compared.value.getWeight();
        return currentValue - comparedValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "type=" + type +
                ", value=" + value +
                '}';
    }
}
