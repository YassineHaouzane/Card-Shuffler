package com.yassine.haouzane.cardgame.services;

import com.yassine.haouzane.cardgame.model.card.Card;
import com.yassine.haouzane.cardgame.service.ShuffleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ShuffleServiceTest {
    @Autowired
    private ShuffleService service;

    @Test
    public void contextLoads() throws Exception {
        assertThat(service).isNotNull();
    }

    @Test
    public void shouldNotContainDuplicates() throws Exception {
        List<Card> hand = service.getShuffledHand();
        Set<Card> handWithoutDuplicates = new HashSet<>(hand);
        assertThat(handWithoutDuplicates.size()).isEqualTo(hand.size());
    }
}
