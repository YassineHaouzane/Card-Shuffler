package com.yassine.haouzane.cardgame.model.card;

public record Card(Type type, CardValue value) implements Comparable<Card> {

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
