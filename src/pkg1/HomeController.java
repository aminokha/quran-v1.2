package pkg1;

import com.jfoenix.controls.JFXDatePicker;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    private TextField txtFNameToAdd;
    @FXML
    private TextField txtLNameToAdd;
    @FXML
    private JFXDatePicker DateOfCalcule;
    @FXML
    private ComboBox<String> comboBegin;
    @FXML
    private ComboBox<?> comboEnd;

    @Override
    public void initialize( URL url, ResourceBundle rb ) {
        idColumn.setCellValueFactory(e -> e.getValue().idProperty.asObject());
        FnameColumn.setCellValueFactory(e -> e.getValue().FnameProperty);
        LnameColumn.setCellValueFactory(e -> e.getValue().LnameProperty);
        DateInsColumn.setCellValueFactory(e -> e.getValue().DateInsProperty);
        PeriodColumn.setCellValueFactory(e -> e.getValue().PeriodProperty);
        deColumn.setCellValueFactory(e -> e.getValue().DeProperty);
        jusquaColumn.setCellValueFactory(e -> e.getValue().jusquaProperty);
        nbrDe8Column.setCellValueFactory(e -> e.getValue().nbrDe8Property);
        totalColumn.setCellValueFactory(e -> e.getValue().TotalProperty);
//        tableView.selectionModelProperty().
        tableView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Student> observable, Student oldValue, Student newValue) -> {
            if (tableView.getSelectionModel().isEmpty()) {
                btnDelete.setDisable(true);
            } else {
                btnDelete.setDisable(false);
            }
        });
//        btnDelete.disableProperty().bind(tableView.proper);
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
            Tools.delete(sql);
            Tools.fillTable(tableView);
            refresh_LastID();
        } 
    }

    public void refresh_LastID() {
        Main.lastID = 0;
        for (int i = 0; i < tableView.getItems().size(); i++) {
            Main.lastID = tableView.getItems().get(i).idProperty.get();
        }
    }

    @FXML
    private void calcule() {
        calculation.calculate(tableView, DateOfCalcule.getValue());
    }

    @FXML
    private void editData() {
        calculation.calculate(tableView, DateOfCalcule.getValue());
    }

//    @FXML
//    private void ToHomeStage() {
//        Main.addingStage.hide();
//        Tools.fillTable(tableView);
//        Main.homeStage.show();
//    }
}
