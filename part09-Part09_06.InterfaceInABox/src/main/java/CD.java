/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class CD implements Packable{
//     the artist (String), name of the CD (String), and the publication year (int).
//    The weight of all CDs is 0.1 kg.
    private String artist;
    private String CDName;
    private int year;
    private double weight;
    
    public CD(String artist, String name, int year){
        this.artist = artist;
        this.CDName = name;
        this.year = year;
        this.weight = 0.1;
    }
    
    public double weight(){
        return this.weight;
    }
    
    public String toString(){
//        Rendezvous Park: Closer to Being Here (2012
        return this.artist + ": " + this.CDName + " (" + this.year + ")";
    }
    
}
