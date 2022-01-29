/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */

public class Book {
    private String name;
    private int age;
    
    public Book(String bookName, int recommondedAge){
        this.name = bookName;
        this.age = recommondedAge;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    @Override
    public String toString(){
        return this.name + "(recommended for " + this.age + " year-olds or older)";
    }
}