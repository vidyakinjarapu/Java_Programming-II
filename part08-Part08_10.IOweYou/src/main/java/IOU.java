
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
public class IOU {
    private HashMap<String, Double> oweList;
    
    public IOU(){
        this.oweList = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        if(!this.oweList.containsKey(toWhom)){
            this.oweList.put(toWhom, 0.0);
        }
        double oweAmount = this.oweList.get(toWhom);
        oweAmount += amount;
        this.oweList.put(toWhom, oweAmount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        double amt = this.oweList.getOrDefault(toWhom, 0.0);
        return amt;
    }
}
