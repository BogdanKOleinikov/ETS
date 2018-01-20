package ets;

/**
 * DeckFactory interface
 * @author bogdan oleinikov
 */
public interface DeckFactory {
    
	/**
	 * Creates a new deck of cards
	 * @return deck of cards
	 */
    public Deck build();
    
}
