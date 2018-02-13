package pkg1;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class HomeStage extends Stage{

    public HomeStage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("HomeView.fxml"));
            Scene scene = new Scene(root);
            setScene(scene);
            setResizable(false); 
            setWidth(Screen.getPrimary().getVisualBounds().getWidth());
            setHeight(Screen.getPrimary().getVisualBounds().getHeight());
            setMaximized(true);
            setTitle("برنامج القرآن الكريم v1.0");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }    
}
