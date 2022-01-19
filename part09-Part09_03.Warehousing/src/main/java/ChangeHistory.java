
import java.util.ArrayList;
import java.util.Objects;


public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.history);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChangeHistory other = (ChangeHistory) obj;
        if (!Objects.equals(this.history, other.history)) {
            return false;
        }
        return true;
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        double max = 0.0;
        for(Double val: this.history){
            if(val > max){
                max = val;
            }
        }
        return max;
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        double min = this.history.get(0);
        for(Double val: this.history){            
            if(val < min){
                min = val;
            }
        }
        return min;
    }
    public double average(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        double sum = 0;
        for(Double val: this.history){            
            sum = sum + val;
        }
        return sum / this.history.size();
    }   
    
    @Override
    public String toString(){
        return this.history.toString();
    }  
}
