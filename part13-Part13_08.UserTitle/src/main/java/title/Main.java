package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title: ");
        String name = scanner.nextLine();
        Application.launch(UserTitle.class,
               "--title="+name);
    }
}
