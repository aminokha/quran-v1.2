package pkg1;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddingStage extends Stage {

    public AddingStage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddingView.fxml"));
            Scene scene = new Scene(root);
            setScene(scene);
            setResizable(false);
            setTitle("إضافة طالب");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
