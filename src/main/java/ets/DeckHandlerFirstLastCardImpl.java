package ets;

import java.util.List;
import java.util.Optional;

/**
 * DeckHandler implementation configured by Spring. Deals either the first or the last Card of the Deck.
 * @author bogdan oleinikov
 */
public class DeckHandlerFirstLastCardImpl implements DeckHandler{
    //configured by Spring. true removes the first card. false removes the last card. 
	private boolean removeFirst = true;
    
    @Override
    public Optional<Card> dealOneCard(Deck deck) {
        List<Card> cards = deck.getCards();
        return Optional.ofNullable(cards.isEmpty()?null:cards.remove(removeFirst?0:cards.size()-1));
    }
    
    /**
     * setter of the removeFirst
     * @param removeFirst boolean 
     */
    public void setRemoveFirst(boolean removeFirst) {
        this.removeFirst = removeFirst;
    }
    
}
