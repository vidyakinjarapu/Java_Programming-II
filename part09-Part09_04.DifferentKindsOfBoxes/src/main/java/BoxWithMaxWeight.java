
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public int sumItems(){
        int sum = 0;
        for(Item item : this.items){
            sum = sum + item.getWeight();
        }
        return sum;
    }
    

    @Override
    public void add(Item item){
        if(this.capacity >= item.getWeight() + this.sumItems()){
            this.items.add(item);
        }
//        System.out.println("add(Item item)");
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }    
}
