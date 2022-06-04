/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vidya
 */
public class AverageSensor implements Sensor{
//    private Sensor sensor; 
    private ArrayList<Sensor> sensorList;
    private ArrayList<Integer> readingList; 
    
    public AverageSensor(){
        this.sensorList = new ArrayList<>(); 
        this.readingList = new ArrayList<>();
    }
    
    @Override
    public boolean isOn() {
        for(Sensor sensor: this.sensorList){
            if(sensor.isOn() != true){
                return false;
            }            
        }
        return true;
    }

    @Override
    public void setOn() { 
        for(Sensor sensor: this.sensorList){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor: this.sensorList){
            sensor.setOff();
        }
    }
    
    @Override
    public int read(){  
        if(this.sensorList.isEmpty() || this.isOn() == false){
            throw new IllegalStateException("The average sensor should be on.");
        }
        double averageTemperature = this.sensorList.stream()
                .mapToInt(s -> Integer.valueOf(s.read()))
                .average().getAsDouble();
        
        this.readingList.add((int) averageTemperature);
        return (int) averageTemperature;
    }
    
    public void addSensor(Sensor toAdd){
        this.sensorList.add(toAdd);
    }
    
    public int AverageSensor(){
        return this.read();
    }
    
    public List readings(){
       return this.readingList;  
    }
}
