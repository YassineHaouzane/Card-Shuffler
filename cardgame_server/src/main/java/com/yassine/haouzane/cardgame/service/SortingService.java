package com.yassine.haouzane.cardgame.service;

import com.yassine.haouzane.cardgame.model.card.Card;
import com.yassine.haouzane.cardgame.model.card.Type;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SortingService {
    public List<Card> sortHand(List<Card> hand) {
        var shuffledTypes = new ArrayList<>(List.of(Type.values()));
        Collections.shuffle(shuffledTypes);
        return hand.stream()
                .sorted((c1, c2) -> c1.getType() == c2.getType() ? c1.compareTo(c2)
                        : shuffledTypes.indexOf(c1.getType()) - shuffledTypes.indexOf(c2.getType()))
                .collect(Collectors.toList());
    }
}
