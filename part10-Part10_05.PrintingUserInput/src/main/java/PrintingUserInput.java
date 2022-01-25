
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listItems = new ArrayList<>();
        
        System.out.println("Press an empty string (only presses enter) to stop : ");
        while(true){
            String ip = scanner.nextLine();
            if(ip.equals("")){
                break;
            }
            listItems.add(ip);
        }
        
//        String finalip = listItems.stream()
//                .reduce("", (added, item)-> added + item + "\n");
//        System.out.println(finalip);
        
        listItems.stream().forEach(s -> System.out.println(s));
    }
}
