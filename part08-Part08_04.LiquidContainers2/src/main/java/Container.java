/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Container {
    private int amt;
    
    public Container(){
        this.amt = 0;
    }
    
    public int contains(){
        return this.amt;
    }
    
    public void add(int amount){
        if(amount > 0){
            this.amt = this.amt + amount;
            if(this.amt > 100){
                this.amt = 100;
            }
        }
    }
    
    public void remove(int amount){
        if(amount > 0) {
            this.amt -= amount;
            if(this.amt < 0){
                this.amt = 0;
            }
        }
    }
    

    
    @Override
    public String toString(){
        return this.amt + "/100";
    }
}
