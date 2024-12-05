/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probability;

/**
 *
 * @author User
 */
public class ProbabilityProject {

    //output of Deck class
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("--- Sample Data: Deck of Cards ---");
        System.out.print(deck);
        
        //calcJointProbability(deck.getCards());
        // methods EXP: calcMarginalProbability()
    }
    
    // private static void calcJointProbability(List<Card> cards){}

}
