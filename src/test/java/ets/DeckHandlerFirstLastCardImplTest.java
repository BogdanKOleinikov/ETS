package ets;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static ets.Suit.HEARTS;
import static ets.Suit.CLUBS;
import static ets.Suit.DIAMONDS;
import static ets.Suit.SPADES;
import static ets.FaceValue.TWO;

public class DeckHandlerFirstLastCardImplTest {

	@Test
	public void testDealOneCard() {
		DeckHandlerFirstLastCardImpl handler = new  DeckHandlerFirstLastCardImpl();
		Deck deck = new DeckListImpl();
		Card heartCard = new Card(HEARTS, TWO);
		Card clubCard = new Card(CLUBS, TWO);
		Card diamondCard = new Card(DIAMONDS, TWO);
		Card spadeCard = new Card(SPADES, TWO);
	
		List<Card> cards = deck.getCards();
		//add Cards to a sample deck
		cards.add(heartCard);
		cards.add(clubCard);
		cards.add(diamondCard);
		cards.add(spadeCard);	
		//Test the First Card being removed scenario
		assertEquals(heartCard, handler.dealOneCard(deck).get());
		//Test the Last Card being removed scenario
		handler.setRemoveFirst(false);
		assertEquals(spadeCard, handler.dealOneCard(deck).get());
		
	}

}
