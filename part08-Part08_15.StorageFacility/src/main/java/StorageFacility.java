
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
public class StorageFacility {
    HashMap<String, ArrayList<String>> Storage;
    
    public StorageFacility(){
        this.Storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.Storage.putIfAbsent(unit, new ArrayList<>());
        this.Storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.Storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
         this.Storage.remove(this.Storage.get(storageUnit), this.Storage.get(storageUnit).remove(item));
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> StorageUnits = new ArrayList<>();
        for(String unit: this.Storage.keySet()){
            if(!(this.Storage.get(unit).isEmpty())){
                StorageUnits.add(unit);
            }
        }
        return StorageUnits;
    }
}

