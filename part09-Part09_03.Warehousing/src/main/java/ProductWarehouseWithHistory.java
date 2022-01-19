/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
//    private double balance;
    private ChangeHistory his = new ChangeHistory(); 
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        his.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);   
        his.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        amount = super.takeFromWarehouse(amount);
        his.add(super.getBalance());
        return amount;       
    }
    
    public String history(){   
        return his.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + his.maxValue());
        System.out.println("Smallest amount of product: " + his.minValue());
        System.out.println("Average: " + his.average());
    }
}
