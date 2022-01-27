
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println("Enter a file name: ");
        String file = scanner.nextLine();
        readBooks(file);   
    }
    
    public static List<Book> readBooks(String file){
//        List<Book> books = new ArrayList<>();
        try{
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(line -> line.length >= 4)
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
//                    .forEach(Book -> books.add(Book));
                    .collect(Collectors.toList());
        }catch(Exception e){
            System.out.println("No such file exist: " + e.getMessage());
        }
        
//        return books;
        return new ArrayList<>();
    }
}
