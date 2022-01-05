/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String cmd = scanner.nextLine();
            if(cmd.equals("stop")){
                break;
            }
            if(cmd.equals("add")){
                System.out.print("To add:");
                String s = scanner.nextLine();
                this.list.add(s);
            }
            if(cmd.equals("list")){
                this.list.print();
            }
            if(cmd.equals("remove")){
                System.out.print("Which one is removed?");
                int num = Integer.valueOf(scanner.nextLine());
                this.list.remove(num);
            }
        }
    }
}
