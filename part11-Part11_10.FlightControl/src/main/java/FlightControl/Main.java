    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;

import FlightControl.logic.FlightControl;

/**
 *
 * @author vidya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FlightControl fc = new FlightControl();
        Scanner sc = new Scanner(System.in);
        
        TextUI ui = new TextUI(fc, sc);
        ui.start();
    }
    
}
