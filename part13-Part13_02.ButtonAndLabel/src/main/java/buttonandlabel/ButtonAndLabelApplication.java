package buttonandlabel;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication extends Application{

    public void start(Stage window) {
        Button btn = new Button("I am a button");
        Label label = new Label("I am the label");
        
        FlowPane components = new FlowPane();
        components.getChildren().add(btn);
        components.getChildren().add(label);
        
        Scene view = new Scene(components);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
}
