/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Dog extends Animal implements NoiseCapable{
//    private String animalName;
    
    public Dog(){
        this("Dog");
    }
    public Dog(String animalName){
        super(animalName);
    }   
    
    public void bark(){
        System.out.println(super.getName() + " barks");
    }    
    
    public void makeNoise(){
        this.bark();
    }
}