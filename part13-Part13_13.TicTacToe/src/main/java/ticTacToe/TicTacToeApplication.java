package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;


public class TicTacToeApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        String turn = "X";
        /*
        if(turn.equals("X")){
            turn = "O";
        } else {
            turn = "X";
        }
        */
        //Creating top element
        Label topLabel = new Label("Turn: " + turn);
        topLabel.setFont(Font.font("Monospaced", 40));
        
        //Creating 9 buttons
        Button btn00 = new Button(" ");
        btn00.setFont(Font.font("Monospaced", 40));
        Button btn01 = new Button(" ");
        btn01.setFont(Font.font("Monospaced", 40));
        Button btn02 = new Button(" ");
        btn02.setFont(Font.font("Monospaced", 40));
        Button btn10 = new Button(" ");
        btn10.setFont(Font.font("Monospaced", 40));
        Button btn11 = new Button(" ");
        btn11.setFont(Font.font("Monospaced", 40));
        Button btn12 = new Button(" ");
        btn12.setFont(Font.font("Monospaced", 40));
        Button btn20 = new Button(" ");
        btn20.setFont(Font.font("Monospaced", 40));
        Button btn21 = new Button(" ");
        btn21.setFont(Font.font("Monospaced", 40));
        Button btn22 = new Button(" ");
        btn22.setFont(Font.font("Monospaced", 40));
        
        //Addingbuttons to the grid pane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setPadding(new Insets(10, 10, 10, 10));
        
        pane.add(btn00, 0, 0);
        pane.add(btn01, 0, 1);
        pane.add(btn02, 0, 2);
        pane.add(btn10, 1, 0);
        pane.add(btn11, 1, 1);
        pane.add(btn12, 1, 2);
        pane.add(btn20, 2, 0);
        pane.add(btn21, 2, 1);
        pane.add(btn22, 2, 2);
        
        //Adding elements to borderpane
        layout.setTop(topLabel);
        layout.setCenter(pane);
        
        Scene view = new Scene(layout, 350, 350);
        
        stage.setScene(view);
        stage.show();       
    }
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
