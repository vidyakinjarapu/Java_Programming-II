/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author vidya
 */
public class SaveableDictionary {
    private HashMap<String, String> storedict;
    private String fileName;
    
    
    //Constructors
    public SaveableDictionary(){
        this.storedict = new HashMap<>();
    }
    public SaveableDictionary(String file){
        this.storedict = new HashMap<>();
        this.fileName = file;
    }
    
    //Methods
    public void add(String words, String translation){
        this.storedict.putIfAbsent(words, translation);
    }
    
    public String translate(String word){
        
        if(this.storedict.containsValue(word)){
//            System.out.println("I'm in value!");
            for(String key: this.storedict.keySet()) {
                if(this.storedict.get(key).equals(word)) {
                    return key; 
                }
            }
        } else if(this.storedict.containsKey(word)){
//            System.out.println("I am in key");
            return this.storedict.get(word);
        } else {
//            System.out.println("Im in null");
            return null;
        }
        return null;   
    }
    
    public void PrintDictionary(){
        for(String word: this.storedict.keySet()){
            System.out.println(word + " : " +this.storedict.get(word));
        }
    }
    
    public void delete(String word){        
        if(this.storedict.containsValue(word)){
            String newWord = "";
            for(String key: this.storedict.keySet()) {
                if(this.storedict.get(key).equals(word)) {
                    newWord = key;
                }
            }
            this.storedict.remove(newWord);
        } else {
            this.storedict.remove(word);
        }
    }
    
    public boolean load(){
        try (Scanner fileReader = new Scanner(Paths.get(fileName))){
            while (fileReader.hasNextLine()) {
//                System.out.println("I am in reader block!");
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character
                this.storedict.put(parts[0], parts[1]);  
//                System.out.println("1." + parts[0] + " 2." + parts[1]);
            }
            return true;
        } catch(Exception e){
//            System.out.println("I am in exception block!");
            return false;
        }
    }
    
    public boolean save(){
        try(PrintWriter writer = new PrintWriter(fileName)){
            for(String key: this.storedict.keySet()){
                writer.println(key + ":" + this.storedict.get(key));               
            }
            writer.close();
            return true;
        } catch(Exception e){
            return false;
        }
    }
}