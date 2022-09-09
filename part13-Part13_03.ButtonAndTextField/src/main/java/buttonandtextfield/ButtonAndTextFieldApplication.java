package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class ButtonAndTextFieldApplication extends Application{
    
    public void start(Stage window) {
        Button btn = new Button("I am a button");
        TextField text = new TextField("I am the text in textfield");
        
        FlowPane components = new FlowPane();
        components.getChildren().add(btn);
        components.getChildren().add(text);
        
        Scene view = new Scene(components);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
