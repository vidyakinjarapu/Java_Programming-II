
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int input = Integer.valueOf(scanner.nextLine());
        
        
        for(int i = 0; i < input; i++){
            Random rand = new Random();
            System.out.println(rand.nextInt(11));
        }
    }

}
