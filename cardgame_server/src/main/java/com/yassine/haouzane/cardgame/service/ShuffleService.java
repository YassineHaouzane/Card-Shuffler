package com.yassine.haouzane.cardgame.service;

import com.yassine.haouzane.cardgame.model.card.Card;
import com.yassine.haouzane.cardgame.model.deck.Deck;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShuffleService {

    private final Deck deck;

    public ShuffleService(Deck d) {
        this.deck = d;
    }

    public List<Card> getShuffledHand() {
        var HAND_SIZE = 10;
        return deck.getRandomCards(HAND_SIZE);
    }

}
