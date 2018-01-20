
package ets;

import java.util.List;

/**
 * DeckFactory implementation
 * @author bogdan oleinikov
 */
public class DeckFactoryImpl implements DeckFactory{ 

    @Override
    public Deck build() {
        Deck deck = new DeckListImpl();
        List<Card> cards = deck.getCards();
        for(Suit suit : Suit.values()){
            for (FaceValue value : FaceValue.values()){
                Card card = new Card(suit,value);
                cards.add(card);
            }
        }
        return deck;
    }
    
    
}
