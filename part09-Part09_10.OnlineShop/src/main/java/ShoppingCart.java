
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class ShoppingCart {
    private Map<String, Item> cart;
//    private int qty;
    
    public ShoppingCart(){
        this.cart = new HashMap<>();
//        this.qty = 1;
    }
    
    public void add(String product, int price){
        if(!(cart.keySet().contains(product))){
            cart.put(product, new Item(product, 1 ,price));  
        } else {
            cart.get(product).increaseQuantity();
        }
    }
    
    public int price(){
        int total = 0;
        for(Item item: cart.values()){
            total = total + item.price();
        }
        return total;
    }
    
    public void print(){
        for(Item item: cart.values()){
            System.out.println(item);
        }
    }  
}
