package pkg1;

import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static pkg1.Tools.createDataBase;

public class Main extends Application {

    static AddingStage addingStage;
    static HomeStage homeStage;
    static EditStage editStage;
    //controllers
    static HomeController homeController;
    static int lastID = 1;

    @Override
    public void start( Stage stage ) throws Exception {
        createDataBase();
        addingStage = new AddingStage();
        homeStage = new HomeStage();
        homeStage.getScene().setOnKeyPressed(e -> {
            if (e.isAltDown() && e.isControlDown() && e.getCode() == KeyCode.C) {
                if (JOptionPane.showConfirmDialog(null, "ستؤدي هذه العملية إلى حذف بيانات جميع التلاميذ ،هل تريد فعل هذا") == 0) {
                    Tools.executeSQL("delete from student where id < 500 ");
                    Tools.fillTable(homeController.tableView);
                    Tools.refresh_LastID(homeController);
                }
            }
        });
        homeStage.show();
    }

    public static void main( String[] args ) {
        launch(args);
    }

}
