
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> Translations;
    
    public DictionaryOfManyTranslations(){
        this.Translations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.Translations.putIfAbsent(word, new ArrayList<>());
        this.Translations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        this.Translations.putIfAbsent(word, new ArrayList<>());
        return this.Translations.get(word);
        //return Translations.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.Translations.remove(word, this.Translations.get(word));
    }
    
}
