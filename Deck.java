package probability.project;

import probability.project.Card;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Neoh
 * constructs entire deck and store in ArrayList(Card)
 */
public class Deck {
    private List<Card> cards;
    
    //construct deck
    public Deck(){
        cards = new ArrayList<>();
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        
        for(String suit : suits){
            for(String rank : ranks){
                cards.add(new Card(suit,rank));
            }
        }
    }
    
    //store in array
    public List<Card> getCards(){
        return cards;
    }
    
    //appends card string from Card class & returns full deck as string
    @Override
    public String toString(){
        StringBuilder deckRepresentation = new StringBuilder();
        for (Card card :cards){
            deckRepresentation.append(card).append("\n");
        }
        return deckRepresentation.toString();
    }
}
