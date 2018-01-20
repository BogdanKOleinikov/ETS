package ets;

import java.util.Optional;

/**
 * Represents Dealer interface
 * @author bogdan oleinikov
 */
public interface Dealer {

	/**
	 * Shuffles Deck
	 */
    void shuffle();
     
    /**
     * Requests a new Deck
     */
    void requestNewDeck();

    /**
     * Deals one Card to the caller
     * @return optional card
     */
    Optional<Card> dealOneCard();

    /**
     * Gets current size of the Dealer's deck
     * @return current size of the Dealer's deck
     */
    int getDeckSize(); 
}
