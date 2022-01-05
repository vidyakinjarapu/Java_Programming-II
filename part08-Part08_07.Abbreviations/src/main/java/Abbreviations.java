
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Abbreviations {
    private HashMap<String, String> AbbrList;
    
    public Abbreviations(){
        this.AbbrList = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.AbbrList.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.AbbrList.containsKey(abbreviation);
    }
    
    public  String findExplanationFor(String abbreviation){
        return this.AbbrList.get(abbreviation);
    }
}
