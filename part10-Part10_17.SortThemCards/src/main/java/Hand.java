
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for (Card card : this.hand) {
            System.out.println(card.toString());
        } 
    }
    
    public int sumOfHand(){
        int sum = this.hand.stream()
                .map(card -> card.CardSum())
                .reduce(0, (preSum, item) -> preSum + item);
        return sum;
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public void sortBySuit(){
        Comparator<Card> comparator = Comparator 
                .comparing(Card::getSuitValue)
                .thenComparing(Card::getValue);

        Collections.sort(this.hand, comparator);
    }

    @Override
    public int compareTo(Hand otherHand) {
        int thisValue = this.hand.stream()           
                .map( card -> card.getValue())
                .reduce(0, (preSum, v) -> preSum + v);
        int otherValue = otherHand.hand.stream()
                .map( card -> card.getValue())
                .reduce(0, (preSum, v) -> preSum + v);
        
        return thisValue - otherValue;
    }
}