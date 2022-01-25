
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers and \"end\" to stop :");
        while(true){
            String in = scanner.nextLine();
            if(in.equals("end")){
                break;
            }
            list.add(Integer.valueOf(in));
        }
        positive(list);
        
        System.out.println(positive(list));
    }
    
    public static List<Integer> positive(List<Integer> numbers){
//        ArrayList<Integer> positives = numbers.stream()
//                .filter(num -> num > 0)
//                .collect(Collectors.toCollection(ArrayList::new));
//        return positives;
        
        return numbers.stream().filter(a -> a > 0).collect(Collectors.toList());
    }
}
