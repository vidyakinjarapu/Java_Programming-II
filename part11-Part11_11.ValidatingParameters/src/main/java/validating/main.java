/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validating;

/**
 *
 * @author vidya
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("vidya", 20);
        System.out.println(person.getAge());
        System.out.println(person.getName());         
    }   
}