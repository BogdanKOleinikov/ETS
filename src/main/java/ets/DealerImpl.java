package ets;

import java.util.Optional;

/**
 * Dealer implementation configured by Spring.
 * @author bogdan oleinikov
 */
public class DealerImpl implements Dealer {
    private Deck deck;
    // configured by Spring
    private Shuffler shuffler;
    // configured by Spring
    private DeckHandler deckHandler;
    // configured by Spring
    private DeckFactory deckFactory;
    
    @Override
    public void shuffle() {
        shuffler.shuffle(deck);
    }

    @Override
    public void requestNewDeck() {
        deck = deckFactory.build();
    }

    @Override
    public Optional<Card> dealOneCard() {
     return deckHandler.dealOneCard(deck);
    }

    public void setShuffler(Shuffler shuffler) {
        this.shuffler = shuffler;
    }

    public void setDeckHandler(DeckHandler deckHandler) {
        this.deckHandler = deckHandler;
    }

    public void setDeckFactory(DeckFactory deckFactory) {
        this.deckFactory = deckFactory;
    }

	@Override
	public int getDeckSize() {
		return (deck==null)?0:deck.getCards().size();
	}
    
}
