package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.event.EventHandler;

public class NotifierApplication extends Application{
    
    public void start(Stage window){
        Button button = new Button("Update");
        TextField textfield = new TextField();
        Label text = new Label();
        
        button.setOnAction((event) -> {
            text.setText(textfield.getText());
        });
        
        VBox vertical = new VBox();
        vertical.setSpacing(30);
        vertical.getChildren().addAll(textfield, button, text);
        
        Scene scene = new Scene(vertical);
        
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
