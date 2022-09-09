package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;


public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button first = new Button("To the first view!");
        Button second = new Button("To the second view!");
        Button third = new Button("To the third view!");
        
        Label labelOne = new Label("First view!");
        Label labelTwo = new Label("Second view!");
        Label labelThree = new Label("Third view!");
        
        BorderPane borderPane = new BorderPane();
        VBox vbox = new VBox();
        GridPane gp = new GridPane();
        
        borderPane.setTop(labelOne);
        borderPane.setCenter(second);
        
        vbox.getChildren().addAll(third, labelTwo);
        
        gp.add(labelThree, 0, 0);
        gp.add(first, 1, 1);
        
        Scene front = new Scene(borderPane);
        Scene middle = new Scene(vbox);
        Scene last = new Scene(gp);
        
        second.setOnAction((event1) -> {
            window.setScene(middle);
        });
        
        third.setOnAction((event2) -> {
            window.setScene(last);
        });
        
        first.setOnAction((event3) -> {
            window.setScene(front);
        });
        
        window.setScene(front);
        window.show();
    }

}
