package someOtherPackage;

/**
 * An instance of this class is used to generate new playing card in a standard deck.
 * Possible suits: Hearts, Spades, Clubs, Diamonds
 * Possible values: 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King and Ace
 * @author Random Guy
 */
public class Card {
    public String value;
    public String suit;

    /**
     * Use this constructor to generate an playing card
     * @param suit
     *            integer 0-3 representing:
     *            0 - Spades;
     *            1 - Clubs;
     *            2 - Hearts;
     *            3 - Diamonds.
     * @param value
     *            integer to set a value of the card, values 0-12, where:
     *            0 - Two
     *            ....
     *            9 - Jack
     *            10 - Queen
     *            11 - King
     *            12 - Ace
     */
    public Card(int suit, int value) {
        setSuit(suit);
        setValue(value);
    }

    /**
     *  set a card value
     * @param value range 0-12
     */
    private void setValue(int value) {
        int cardvalue = value + 2; // add 2 as cards start with "Two"
        if (cardvalue == 11)
            this.value = "Jack";
        else if (cardvalue==12)
            this.value = "Queen";
        else if (cardvalue==13)
            this.value = "King";
        else
            this.value = String.valueOf(cardvalue);
    }

    /**
     * Set card suit
     * @param suitToSet range 0-3
     */
    public void setSuit(int suitToSet) {
        switch (suitToSet) {
            case 1:
                this.suit = "Spades";
                break;
            case 2:
                this.suit = "Clubs";
                break;
            case 3:
                this.suit = "Hearts";
                break;
            case 4:
                this.suit = "Diamonds";
                break;
        }
    }
}

