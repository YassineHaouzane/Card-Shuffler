package com.yassine.haouzane.cardgame.controller;

import com.yassine.haouzane.cardgame.model.card.Card;
import com.yassine.haouzane.cardgame.response.HandResponse;
import com.yassine.haouzane.cardgame.service.ShuffleService;
import com.yassine.haouzane.cardgame.service.SortingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hand")
public class HandController {

    private final ShuffleService shuffler;
    private final SortingService sorter;

    public HandController(ShuffleService shuffler, SortingService sorter) {
        this.shuffler = shuffler;
        this.sorter = sorter;
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public HandResponse getHand() {
        List<Card> shuffledHand = shuffler.getShuffledHand();
        List<Card> sortedHand = sorter.sortHand(shuffledHand);
        return new HandResponse(sortedHand, shuffledHand);
    }
}
