package ets;

import static ets.FaceValue.TWO;
import static ets.Suit.CLUBS;
import static ets.Suit.DIAMONDS;
import static ets.Suit.HEARTS;
import static ets.Suit.SPADES;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class DeckHandlerRandomCardImplTest {

	@Test
	public void testDealOneCard() {
		DeckHandler handler = new DeckHandlerRandomCardImpl();
		
		Deck deck1 = new DeckListImpl();
		Card heartCard = new Card(HEARTS, TWO);
		Card clubCard = new Card(CLUBS, TWO);
		Card diamondCard = new Card(DIAMONDS, TWO);
		Card spadeCard = new Card(SPADES, TWO);
	
		List<Card> cards1 = deck1.getCards();
		//add Cards to a sample deck
		cards1.add(heartCard);
		cards1.add(clubCard);
		cards1.add(diamondCard);
		cards1.add(spadeCard);	
		
		Deck deck2 = new DeckListImpl();
		Card heartCard2 = new Card(HEARTS, TWO);
		Card clubCard2 = new Card(CLUBS, TWO);
		Card diamondCard2 = new Card(DIAMONDS, TWO);
		Card spadeCard2 = new Card(SPADES, TWO);
	
		List<Card> cards2 = deck2.getCards();
		//add Cards to a sample deck
		cards2.add(heartCard);
		cards2.add(clubCard);
		cards2.add(diamondCard);
		cards2.add(spadeCard);	
		assertEquals(cards1, cards2);
		
		//Test the Card being removed is random scenario
		assertNotEquals(handler.dealOneCard(deck1).get(), handler.dealOneCard(deck2).get());
		
		
	}

}
