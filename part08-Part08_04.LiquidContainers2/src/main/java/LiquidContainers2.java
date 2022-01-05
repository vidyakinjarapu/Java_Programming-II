
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container First = new Container();
        Container Second = new Container();

        while (true) {
            System.out.println("First: " + First.toString());
            System.out.println("Second: " + Second.toString());
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(cmd.equals("add") && amount > 0){
                First.add(amount);
            }
            
            if(cmd.equals("move")&& amount > 0){
                if(amount > First.contains()){
                    amount = First.contains();
                }   
                First.remove(amount);
                Second.add(amount);
            }
            
            if(cmd.equals("remove")&& amount > 0){
                Second.remove(amount);
            }
        }

    }
}
