
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products = new HashMap<>();
    private Map<String, Integer> stockBalance = new HashMap<>();
    
    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        stockBalance.put(product, stock);
    }
    
    public int price(String product){
        if(products.containsKey(product)){
            return products.get(product);
        }
        return -99;
//        return this.products.getOrDefault(product, -99);
    }
    
    public int stock(String product){
       if(stockBalance.containsKey(product)){
            return stockBalance.get(product);
        }
        return 0;
//        return this.stockBalance.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(stockBalance.containsKey(product) && stockBalance.get(product) > 0){
            stockBalance.put(product, stockBalance.get(product)-1);
            return true; 
        }
        return false;
    }
    
    public Set<String> products(){
        return products.keySet();
    }
}
