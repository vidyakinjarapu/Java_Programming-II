
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<CountryLiteracy> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(lines -> lines.split(","))
                    .map(parts -> new CountryLiteracy(parts[3], Integer.valueOf(parts[4]), parts[2], Double.valueOf(parts[5])))
                    .forEach(row -> rows.add(row));
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        
        rows.stream() 
                .sorted((t1, t2) -> {
                    if(t1.getRate() > t2.getRate()){
                        return 1;
                    } else if(t1.getRate() == t2.getRate()){
                        return 0;
                    } else {
                        return -1;
                    }
                }).forEach(item -> System.out.println(item));
    }
}