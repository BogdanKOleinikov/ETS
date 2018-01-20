package ets;

import java.util.List;
import java.util.Optional;
import java.util.Random;
/**
 * DeckHandler implementation. Deals a random Card from the Deck.
 * @author bogdan oleinikov
 *
 */
public class DeckHandlerRandomCardImpl implements DeckHandler {

	@Override
	public Optional<Card> dealOneCard(Deck deck) {
		List<Card> cards = deck.getCards();
		Random randomGenerator = new Random();
		int randomCard = 0;
		if (cards.size() != 0) {
			randomCard = randomGenerator.nextInt(cards.size());
		}
		return Optional.ofNullable(cards.isEmpty() ? null : cards.remove(randomCard));
	}

}
