
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
public class Pipe<T> {
    private ArrayList<T> pipeList;
    
    public Pipe(){
        this.pipeList = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipeList.add(0, value);
    }
    
    public T takeFromPipe(){
        if(this.pipeList.isEmpty()){
            return null;
        } else {
            T item = this.pipeList.get(this.pipeList.size()- 1);
            this.pipeList.remove(this.pipeList.size()-1);
            return item;
        }
    }
    
    public boolean isInPipe(){
        return !(this.pipeList.isEmpty());
    }
    
    public void printPipe(){
        for(T item: this.pipeList){
            System.out.println("Item List: " + item);
        }
    }
}
