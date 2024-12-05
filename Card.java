package probability.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neoh
 * get suit and rank from Deck class
 */
public class Card {
    private final String suit;
    private final String rank;
    
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    public String getSuit(){
        return suit;
    }
    
    public String getRank(){
        return rank;
    }
    
    //help to return string like "Ace of Hearts", "2 of Hearts"
    @Override
    public String toString(){
        return rank + " of " +suit;
    }
}
