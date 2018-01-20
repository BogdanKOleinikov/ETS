package ets;

import static ets.FaceValue.TWO;
import static ets.Suit.CLUBS;
import static ets.Suit.DIAMONDS;
import static ets.Suit.HEARTS;
import static ets.Suit.SPADES;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShufflerImplTest {

	@Test
	public void testShuffle() {
		Shuffler shuffler = new ShufflerImpl();
		Deck deck = new DeckListImpl();
		Card heartCard = new Card(HEARTS, TWO);
		Card clubCard = new Card(CLUBS, TWO);
		Card diamondCard = new Card(DIAMONDS, TWO);
		Card spadeCard = new Card(SPADES, TWO);
		List<Card> deckCards = deck.getCards();
		deckCards.add(heartCard);
		deckCards.add(clubCard);
		deckCards.add(diamondCard);
		deckCards.add(spadeCard);

		List<Card> cardsUnshuffled = new ArrayList(deckCards);
		assertEquals(cardsUnshuffled, deckCards);
		shuffler.shuffle(deck);
		assertNotEquals(cardsUnshuffled, deckCards);
	}

}
