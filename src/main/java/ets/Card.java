package ets;

/**
 * Represents Card
 * 
 * @author bogdan oleinikov
 */
public class Card {
	private Suit suit;
	private FaceValue value;

	/**
	 * Constructor
	 * @param suit of the card
	 * @param value face value of the card
	 */
	public Card(Suit suit, FaceValue value) {
		this.suit = suit;
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("%s of %s", value, suit);
	}
}
