
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop");
        
        while(true){
            String in = scanner.nextLine();
            if(in.equals("end")){
                break;
            }
            inputs.add(Integer.valueOf(in));
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userIp = scanner.nextLine();
        if(userIp.equals("n")){
            double negAverage = inputs.stream()
                .mapToInt(i -> i)
                .filter(i -> i < 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + negAverage);
        } else {
            double posAverage = inputs.stream()
                .mapToInt(i -> i)
                .filter(i -> i >= 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the positive numbers: " + posAverage);
        }
    }
}
