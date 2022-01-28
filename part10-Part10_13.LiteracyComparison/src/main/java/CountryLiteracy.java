/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class CountryLiteracy{
    private String country;
    private int year;
    private String gender;
    private double rate;
    
    public CountryLiteracy(String countryName, int year, String gender, double literacyRate){
        this.country = countryName;
        this.gender = gender;
        this.year = year;
        this.rate = literacyRate;   
    }
    
    public String getName(){
        return this.country;
    }
    
    public double getRate(){
        return this.rate;
    }
    
    public String getGender(){
        if(this.gender.contains("female")){
            return "female";
        } else {
            return "male";
        }
    }
    
    @Override
    public String toString(){
        return this.country +  " (" + this.year + "), " + this.getGender() +", " + this.rate; 
    }
    

    
//    @Override
//    public int compareTo(CountryLiteracy country) {
//        if(this.getRate() > country.getRate()){
//            return 1;
//        } else if(this.getRate() == country.getRate()){
//            return 0;
//        } else {
//            return -1;
//        }
//    }
    
}
