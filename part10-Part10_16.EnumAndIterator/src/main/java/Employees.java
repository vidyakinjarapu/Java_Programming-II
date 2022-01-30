
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    ArrayList<Person> persons;
    
    public Employees(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream()
                .forEach(person -> this.persons.add(person));
    }
    
    public void print(){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == education){
                System.out.println(p);
            }
            
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }
}
