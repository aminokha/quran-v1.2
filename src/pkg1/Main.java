package pkg1;

import java.sql.SQLException;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static pkg1.Tools.createDataBase;

public class Main extends Application {

    static HomeStage homeStage;
    static AddingStage addingStage;
    static EditStage editStage;
    //controllers
    static HomeController homeController;
    static EditController editController;
    static int lastID = 1;

    @Override
    public void start( Stage stage ) throws Exception {
        new Thread(() -> {
            try {
                createDataBase();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }).start();
        
        homeStage = new HomeStage();
        editStage = new EditStage();
        addingStage = new AddingStage();
        homeStage.show();
    }

    public static void main( String[] args ) {
        launch(args);
    }

}
