package ets;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Shuffler implementation configured by Spring
 * @author bogdan oleinikov
 */
public class ShufflerImpl implements Shuffler {
	// randomizer configurable by Spring
    private Random randomizer;

    @Override
    public void shuffle(Deck deck) {
        List<Card> cards = deck.getCards();
        if (randomizer == null) {
        	//shuffles using default randomizer
            Collections.shuffle(cards);
        } else {
        	//shuffles using configured randomizer
            Collections.shuffle(cards, randomizer);
        }
    }
    
    /**
     * Sets randomizer
     * @param randomizer
     */
    public void setRandomizer(Random randomizer) {
        this.randomizer = randomizer;
    }

}
