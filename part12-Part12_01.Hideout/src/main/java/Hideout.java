/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 * @param <T>
 */
public class Hideout<T> {
    private T hidingElement;
    
//    public Hideout(){
//        this.values = new ArrayList<>(); 
//    }
    
    //methods
    public void putIntoHideout(T toHide){
        this.hidingElement = toHide;
    }
    
    public T takeFromHideout(){
         T present = this.hidingElement;
         this.hidingElement = null;
         return present;
         
    }
    
    public boolean isInHideout(){
        return this.hidingElement != null;
    }
}
