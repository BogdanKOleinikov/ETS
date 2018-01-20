
package ets;

import java.util.ArrayList;
import java.util.List;

/**
 * Deck implementation uses ArrayList
 * @author bogdan oleinikov
 */
public class DeckListImpl implements Deck{
    //cards if the Deck
    private List<Card> cards = new ArrayList<Card>();
    
    @Override
    public List<Card> getCards() {
        return cards;
    } 
}
