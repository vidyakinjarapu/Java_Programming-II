package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{
    
    @Override
    public void start(Stage window) throws Exception {
        
        //create main layout
        BorderPane layout = new BorderPane();
        
        //create menu of 3 buttons using HBox
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button b1 = new Button("Joke");
        Button b2 = new Button("Answer");
        Button b3 = new Button("Explanation");
        
         menu.getChildren().addAll(b1, b2, b3);
         layout.setTop(menu);
         
         //creating layouts for buttons
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("The real bear has teeth but, \nthe gummy bear is a bear with no teeth \n but still it is a bear");
         
        b1.setOnAction((event1) -> layout.setCenter(firstLayout));
        b2.setOnAction((event2) -> layout.setCenter(secondLayout));
        b3.setOnAction((event3) -> layout.setCenter(thirdLayout));
         
         
         //Setting the initital view of the window
         layout.setCenter(firstLayout);
         Scene scene = new Scene(layout);
         
         //Showing the main window
         window.setScene(scene);
         window.show();
    }
    
    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }   
}