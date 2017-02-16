package oop3demo;

/*
 * Created by emailman on 2/14/2017.
 */

import java.util.ArrayList;
import java.util.Collections;

public class OOP3Demo {
    public static void main (String[] args) {
        // This holds the deck
        ArrayList<Card> deck = new ArrayList<>();

        // Each of these hold a hand
        ArrayList<Card> north = new ArrayList<>();
        ArrayList<Card> east = new ArrayList<>();
        ArrayList<Card> south = new ArrayList<>();
        ArrayList<Card> west = new ArrayList<>();

        createDeck(deck);

        Collections.shuffle(deck);

        // Deal all the cards, one at a time to each player
        while (deck.size() != 0) {
            deal(deck, west);
            deal(deck, north);
            deal(deck, east);
            deal(deck, south);
        }

        // Show all the hands
        showHand("North", north);
        showHand("East", east);
        showHand("South", south);
        showHand("West", west);
    }

    private static void createDeck(ArrayList<Card> d) {
        for (String suit : Card.SUITS)
            for (String rank : Card.RANKS)
                // Add this card to the deck
                d.add(new Card(suit, rank));
    }

    private static void deal(ArrayList<Card> d, ArrayList<Card> h) {
        // Add a card to the hand and remove it from the deck
        h.add(d.get(0));
        d.remove(0);
    }

    private static void showHand(String n, ArrayList<Card> h) {
        System.out.printf("%s's hand:\n", n);
        h.forEach(System.out::println);
        System.out.println();
    }
}

class Card {
    // Attributes
    private String suit;
    private String rank;

    // Public constants
    static final String[] SUITS = {"spades", "hearts", "clubs", "diamonds"};
    static final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King"};

    // Constructor
    Card (String s, String r) {
        suit = s;
        rank = r;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }
}