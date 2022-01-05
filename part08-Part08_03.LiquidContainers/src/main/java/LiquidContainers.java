
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String cmd = parts[0];
            int amt = Integer.valueOf(parts[1]);  
            if(amt < 0){
                continue;
            }
            if(cmd.equals("add")){
                if(amt + first > 100){
                    first = 100;
                } else {
                    first = first + amt;
                }
            }
            if(cmd.equals("move")){
                if(first < amt){                    
                    second = first + second;
                    first = 0;
                }
                else if((second + amt) > 100){
                    second = 100;
                } else {
                    second = second + amt;
                    first = first - amt;
                }
            }
            if(cmd.equals("remove")){
                if(amt >= second){
                    second = 0;
                } else {
                    second = second - amt;
                }
            }            
        }
    }
}
