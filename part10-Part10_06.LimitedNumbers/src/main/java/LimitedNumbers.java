
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();
        
        System.out.println("Giving negative input will stop the loop: ");
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num < 0){
                break;
            }
            
            items.add(num);
        }
        
        items.stream()
                .filter(n -> n >=1 && n <=5 )
                .forEach(item -> System.out.println(item));

    }
}
