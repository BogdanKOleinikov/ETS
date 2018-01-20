package ets;

import java.util.Optional;

/**
 * DeckHandler implementation
 * @author bogdan oleinikov
 */
public interface DeckHandler {
	/**
	 * 
	 * @param deck of cards
	 * @return optional card
	 */
    Optional<Card> dealOneCard(Deck deck);
    
}
