package pkg1;

import javafx.application.Application;
import javafx.stage.Stage;
import static pkg1.Tools.createDataBase;

public class Main extends Application {

    static AddingStage addingStage;
    static HomeStage homeStage;
    static int lastID = 1;
    
    @Override
    public void start( Stage stage ) throws Exception {
        createDataBase();
        addingStage = new AddingStage();
        homeStage = new HomeStage();
        homeStage.show();
    }

    public static void main( String[] args ) {
        launch(args);
    }

}
