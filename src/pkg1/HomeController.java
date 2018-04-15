package pkg1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import static pkg1.Main.editStage;
import static pkg1.Main.editController;
import static pkg1.Main.homeController;
import static pkg1.Main.homeStage;
import static pkg1.Tools.refresh_LastID;

public class HomeController implements Initializable {

    @FXML
    Button btnDelete;
    @FXML
    TableView<Student> tableView;
    @FXML
    private TableColumn<Student, Integer> idColumn;

    @FXML
    private TableColumn<Student, String> FnameColumn;

    @FXML
    private TableColumn<Student, String> LnameColumn;

    @FXML
    private TableColumn<Student, String> DateInsColumn;

    @FXML
    private TableColumn<Student, String> PeriodColumn;

    @FXML
    private TableColumn<Student, String> deColumn;

    @FXML
    private TableColumn<Student, String> jusquaColumn;

    @FXML
    private TableColumn<Student, String> nbrDe8Column;

    @FXML
    private TableColumn<Student, String> totalColumn;

    @FXML
    private JFXDatePicker DateOfCalcule;
    @FXML
    private JFXButton btnEdit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        homeController = this;
        idColumn.setCellValueFactory(e -> e.getValue().idProperty.asObject());
        FnameColumn.setCellValueFactory(e -> e.getValue().FnameProperty);
        LnameColumn.setCellValueFactory(e -> e.getValue().LnameProperty);
        DateInsColumn.setCellValueFactory(e -> e.getValue().DateInsProperty);
        PeriodColumn.setCellValueFactory(e -> e.getValue().PeriodProperty);
        deColumn.setCellValueFactory(e -> e.getValue().DeProperty);
        jusquaColumn.setCellValueFactory(e -> e.getValue().jusquaProperty);
        nbrDe8Column.setCellValueFactory(e -> e.getValue().nbrDe8Property);
        totalColumn.setCellValueFactory(e -> e.getValue().TotalProperty);

        tableView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Student> observable, Student oldValue, Student newValue) -> {
            if (tableView.getSelectionModel().isEmpty()) {
                btnDelete.setDisable(true);
                btnEdit.setDisable(true);
            } else {
                btnDelete.setDisable(false);
                btnEdit.setDisable(false);
            }
        });
        Tools.fillTable(tableView);
    }

    @FXML
    private void ToAddStage() throws IOException {
        Main.homeStage.hide();
        Main.addingStage.show();
    }

    @FXML
    private void delete() {
        if (!tableView.getSelectionModel().isEmpty()) {
            int Id = tableView.getSelectionModel().getSelectedItem().idProperty.get();
            String sql = "delete from student where id = " + Id;
            Tools.executeSQL(sql);
            Tools.fillTable(tableView);
            refresh_LastID(this);
        }
    }

    @FXML
    private void deleteKeyIsPressed(KeyEvent event) {
        if ((!tableView.getSelectionModel().isEmpty()) && event.getCode() == KeyCode.DELETE) {
            int Id = tableView.getSelectionModel().getSelectedItem().idProperty.get();
            String sql = "delete from student where id = " + Id;
            Tools.executeSQL(sql);
            Tools.fillTable(tableView);
            refresh_LastID(this);
        }
    }

    @FXML
    private void calcule() {
        calculation.calculate(tableView, DateOfCalcule.getValue());
    }

    

    @FXML
    private void editStudent() {
        homeStage.hide();
        editStage.show();
        editController.fill_Edit_Stage();
    }

    @FXML
    private void mouseClicked(MouseEvent event) {
        if (event.getClickCount() >= 2) {
            editStudent();
        }
    }

}
