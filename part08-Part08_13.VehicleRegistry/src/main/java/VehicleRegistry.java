
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!(registry.containsKey(licensePlate))){
            registry.put(licensePlate, owner);
            return true;
        }
        return false;       
    }
    
    public String get(LicensePlate licensePlate){
        if(!(registry.containsKey(licensePlate))){
            return null;
        }
        return registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(registry.containsKey(licensePlate)){
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate licensePlate: registry.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> name = new ArrayList<>();
        for(String owner: registry.values()) {
            if(name.contains(owner)){
                continue;
            }
            name.add(owner);            
        }
        for(String owner: name){
            System.out.println(owner);
        }
    }
}
