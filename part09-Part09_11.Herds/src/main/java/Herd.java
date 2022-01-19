
import java.util.ArrayList;
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
public class Herd implements Movable{
    private List<Movable> herdList = new ArrayList<>();
        
    public String toString(){
        String out = "";
        for(Movable item: herdList){
            out = out + item.toString() + "\n";
        }
        return out;
    } 
    
    public void addToHerd(Movable movable){
        herdList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable item: herdList){
            item.move(dx, dy);
        }
    }
    
}
