
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0){
                break;
            }
            if(input < 0){
                continue;
            }
            count = count + 1;
            sum = sum + input;
        }
        
        if(count == 0){
            System.out.println("Cannot calculate the average");
        } else {      
            double avg = sum * 1.0 / count;
            System.out.println(avg);         
        } 
        
    }
}
