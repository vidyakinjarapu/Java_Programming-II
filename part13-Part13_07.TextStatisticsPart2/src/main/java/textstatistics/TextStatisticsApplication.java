package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;


public class TextStatisticsApplication extends Application{

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window){
        
        BorderPane layout = new BorderPane();
        TextArea textarea = new TextArea();
        
        HBox horizontal = new HBox();
        horizontal.setSpacing(20);
        Label letters = new Label("Letters: 0");
        Label wordnum = new Label("Words: 0");
        Label longestword = new Label("The longest word is:");
        horizontal.getChildren().addAll(letters, wordnum, longestword);
        
        
        textarea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();
            
            letters.setText("Letters: " + characters);
            wordnum.setText("Words: " + words);
            longestword.setText("The longest word is: " + longest);              
        });
                
        layout.setCenter(textarea);
        layout.setBottom(horizontal);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
}