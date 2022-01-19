/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    public int price(){
        return this.unitPrice * this.qty();
    }
    
    public int qty(){
        return this.qty;
    }
    
    @Override
    public String toString(){
        return this.product + ": " + this.qty;
    }
}
