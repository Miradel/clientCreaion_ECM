package someOtherPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * An instance of this Class is used  to generate standard dack of cards - 52 cards with no Jokers.
 * @author Random Guy
 */
public class DeckOfCards {
    private int numCards = 52;
    private int numClubs = 13;
    private int numSuits = 4;
    protected List<Card> deck = new ArrayList<Card>();

    public DeckOfCards() {
        generateDeck();
    }

    /**
     * Create new deck of 52 cards
     */
    private void generateDeck() {
        for (int i = 0; i < numClubs; i++) {
            for (int j = 0; j < numSuits; j++) {
                Card card = new Card(j, i);
                this.deck.add(card);
            }
        }
    }

    public void dealCards(int cardsToDeal) {
        for (int i = 0; i < cardsToDeal; i++) {
            getRandomCard();
        }
    }

    /**
     * Get random card from deck and print the value
     * Remove card from deck after it's been played
     */
    private void getRandomCard() {
        int randomCard = new Random().nextInt(52);
        deck.remove(randomCard);
        System.out.println(deck.get(randomCard).value + " of " + deck.get(randomCard).suit);
    }

    // Main method to create new deck of cards and deal set amount of cards to player
    public static void main (String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.dealCards(5);
    }
}

