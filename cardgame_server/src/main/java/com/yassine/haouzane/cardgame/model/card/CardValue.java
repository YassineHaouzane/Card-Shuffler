package com.yassine.haouzane.cardgame.model.card;

import lombok.Getter;

public enum CardValue {
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10),
    Jack(11),
    Queen(12),
    King(13),
    Ace(14);

    @Getter
    private final int weight;

    CardValue(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CardValue{" +
                "weight=" + weight +
                '}';
    }
}
