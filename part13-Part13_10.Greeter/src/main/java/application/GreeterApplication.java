package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{      

    public static void main(String[] args) {
        Application.launch(GreeterApplication.class);
    }

    
    @Override
    public void start(Stage window) throws Exception {
        
        Label instruction = new Label("Enter your name and start.");
        TextField text = new TextField();
        Button startButton = new Button("Start");
        String name = text.getText();
          
        //Gridpane -- first layout
        GridPane gp = new GridPane();
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPrefSize(300, 180);
        gp.add(instruction, 0, 0);
        gp.add(text, 0, 1);
        gp.add(startButton, 0, 2);
        gp.setAlignment(Pos.CENTER);
        
        
        //Stackpane -- second layout
        Label second = new Label();
        StackPane sp = new StackPane();
        sp.setPrefSize(300, 180);
        sp.getChildren().add(second);
        sp.setAlignment(Pos.CENTER);
        
        //Setting scenes to use
        Scene stack = new Scene(sp);
        Scene grid = new Scene(gp);
        
        //Add events for button on gridpane
        startButton.setOnAction((event) -> {
            second.setText("Welcome " + text.getText() + "!");
            window.setScene(stack);  
        });
        
        window.setScene(grid);
        window.show();
    }
}
