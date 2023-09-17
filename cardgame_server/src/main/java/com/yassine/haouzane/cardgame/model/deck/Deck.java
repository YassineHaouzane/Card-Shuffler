package com.yassine.haouzane.cardgame.model.deck;

import com.yassine.haouzane.cardgame.model.card.Card;
import com.yassine.haouzane.cardgame.model.card.CardValue;
import com.yassine.haouzane.cardgame.model.card.Type;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Deck {
    private final List<Card> deck;

    public Deck() {
        var DECK_SIZE = 52;
        List<Card> deck = new ArrayList<>(DECK_SIZE);
        for(Type type: Type.values()) {
            for(CardValue value: CardValue.values()) {
                Card c = new Card(type, value);
                deck.add(c);
            }
        }
        this.deck = deck;
    }

    public List<Card> getRandomCards(int numberOfCards) {
        // Copy to not mutate the Deck
        var deckCopy = new ArrayList<>(deck);
        List<Card> hand = new ArrayList<>(numberOfCards);
        var randomGenerator = new Random();
        while(numberOfCards > 0 && deckCopy.size() > 0) {
            int cardIndex = randomGenerator.nextInt(deckCopy.size());
            Card randomCard = deckCopy.get(cardIndex);
            hand.add(randomCard);
            deckCopy.remove(cardIndex);
            numberOfCards--;
        }
        return hand;
    }
}
