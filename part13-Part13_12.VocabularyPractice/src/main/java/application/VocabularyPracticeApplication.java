package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application{
    
    private Dictionary dictionary;
    
    @Override
    public void init() throws Exception {
        // 1. Create the dictionary that the application uses
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //views creation
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);
        
        //Create layout for first view
        BorderPane layout = new BorderPane();
        
        //Creaate menu for general layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        //Creating buttons
        Button enterButton = new Button("Enter new words");
        Button PracticeButton = new Button("Practice");
        
        //Adding butons to hbox
        menu.getChildren().addAll(enterButton, PracticeButton);
        layout.setTop(menu);
        
        //adding events of SubViews to the buttons
        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        PracticeButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));
        
        //Showing the input view by default
        layout.setCenter(inputView.getView());
        
        //Create main view and add high level layout
        Scene view = new Scene(layout, 400, 300);
        
        //show the application
        stage.setScene(view);
        stage.show();       
    }
    
    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
