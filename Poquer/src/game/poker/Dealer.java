package game.poker;

import utilites.Card;
import utilites.Deck;

import java.util.List;

public class Dealer {


    public Hand deal (Deck deck){
        List<Card> cardList = deck.getRandomCards(5);

        Hand hand = new Hand(cardList);
        return hand;
    }
}
