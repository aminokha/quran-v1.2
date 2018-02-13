package pkg1;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EditStage extends Stage{

    public EditStage() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditView.fxml"));
            Scene scene = new Scene(root);
            setScene(scene);
            setResizable(false);
            setTitle("تعديل بيانات طالب");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    

}
