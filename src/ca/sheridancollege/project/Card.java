/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card 
{
    public enum RankCard { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE TEN, JACK, QUEEN, KING, ACE};
    private String cards;
    private RankCard numberOfCards;
    
    //default modifier for child classes
    public Card{
        this.cards = card;
        this.numberOfCards = numberCards;
        
    }
    public RankCard getRank(){
        return numberOfCards
    }
    public void setRank(RankCard numberOfCards){
        this.numberOfCards = numberOfcards;
    }
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();
    
}
