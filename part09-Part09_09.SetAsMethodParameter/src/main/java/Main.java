
import java.util.HashSet;
import java.util.Set;



public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("first");
        set.add("Second");
        set.add("Second");
        set.add("Second");
        System.out.println(returnSize(set));
        
//        for(String item: set){
//            System.out.println(item);
//        }
    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set setEle){
        return setEle.size();
    }
}
