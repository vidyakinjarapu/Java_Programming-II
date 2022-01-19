/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Person {
    private String name;
    private String Address;
    
    public Person(String name, String addr){
        this.name = name;
        this.Address = addr;
    }
    
    public String toString(){
        return this.name + "\n" + "  " + this.Address;
    }
}