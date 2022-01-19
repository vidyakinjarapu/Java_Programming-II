
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maxWeight;
    
    public Box(double maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public double sumWeight(){
        double sum = 0;
        for(Packable item: this.items){
            sum = sum + item.weight();
        }
        return sum;
    }
    
    public void add(Packable item){
        if(this.maxWeight > this.sumWeight() + item.weight()){
            this.items.add(item);
        }
    }
    
    public double weight(){
        double weight = 0;
        weight = this.sumWeight();
        return weight;
    }
    
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.sumWeight() + " kg";
    }
    
}
