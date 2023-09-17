package com.yassine.haouzane.cardgame.response;

import com.yassine.haouzane.cardgame.model.card.Card;
import lombok.Getter;

import java.util.List;

public class HandResponse {
    @Getter
    private final List<Card> sortedHand;
    @Getter
    private final List<Card> shuffledHand;

    public HandResponse(List<Card> sortedHand, List<Card> shuffledHand) {
        this.sortedHand = sortedHand;
        this.shuffledHand = shuffledHand;
    }
}
