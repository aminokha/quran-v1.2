package pkg1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import static pkg1.Main.editStage;
import static pkg1.Main.homeStage;

public class EditController implements Initializable {

    @FXML
    private TextField txtFName;
    @FXML
    private TextField txtLName;
    @FXML
    private JFXDatePicker txtDateIns;
    @FXML
    private ChoiceBox<String> comboBegin;
    @FXML
    private ChoiceBox<String> comboEnd;

    @FXML
    Label lblActionStatus;
    private int Id;
    private String Fname;
    private String Lname;
    private String DateIns;
    private String de;
    private String jusqua;
    private TableView<Student> tableView;
    @FXML
    private JFXButton EditButton;

    @Override
    public void initialize( URL url, ResourceBundle rb ) {
        comboBegin.getItems().addAll("الناس", "الفلق", "الاخلاص", "المسد", "النصر", "الكافرون", "الكوثر", "الماعون",
                  "قريش", "الفيل", "الهمزة", "العصر", "التكاثر", "القارعة", "العاديات", "الزلزلة", "البينة", "القدر",
                  "العلق", "التين", "الشرح", "الضحى", "الليل", "الشمس", "البلد", "الفجر", "الغاشية", "الاعلى", "الطارق",
                  "البروج", "الانشقاق", "المطففين", "الانفطار", "التكوير", "عبس", "النازعات", "النبأ", "المرسلات", "الإنسان",
                  "القيامة", "المدثر", "المزمل", "الجن", "نوح", "المعارج", "الحاقة", "القلم", "الملك", "التحريم", "الطلاق", "التغابن",
                  "المنافقون", "الجمعة", "الصف", "الممتحنة", "الحشر", "المجادلة", "الحديد", "الواقعة", "الرحمان", "القمر", "النجم",
                  "الطور", "الذاريات", "ق", "الحجرات", "الفتح", "محمد", "الأحقاف", "الجاثية", "الدخان", "الزخرف", "الشورى",
                  "فصلت", "غافر", "الزمر", "ص", "الصافات", "يس", "فاطر", "سبأ", "الأحزاب", "السجدة", "لقمان", "الروم", "العنكبوت",
                  "القصص", "النمل", "الشعراء", "الفرقان", "النور", "المومنون", "الحج", "الأنبياء", "طه", "مريم", "الكهف");
        comboEnd.getItems().addAll("الناس", "الفلق", "الاخلاص", "المسد", "النصر", "الكافرون", "الكوثر", "الماعون",
                  "قريش", "الفيل", "الهمزة", "العصر", "التكاثر", "القارعة", "العاديات", "الزلزلة", "البينة", "القدر",
                  "العلق", "التين", "الشرح", "الضحى", "الليل", "الشمس", "البلد", "الفجر", "الغاشية", "الاعلى", "الطارق",
                  "البروج", "الانشقاق", "المطففين", "الانفطار", "التكوير", "عبس", "النازعات", "النبأ", "المرسلات", "الإنسان",
                  "القيامة", "المدثر", "المزمل", "الجن", "نوح", "المعارج", "الحاقة", "القلم", "الملك", "التحريم", "الطلاق", "التغابن",
                  "المنافقون", "الجمعة", "الصف", "الممتحنة", "الحشر", "المجادلة", "الحديد", "الواقعة", "الرحمان", "القمر", "النجم",
                  "الطور", "الذاريات", "ق", "الحجرات", "الفتح", "محمد", "الأحقاف", "الجاثية", "الدخان", "الزخرف", "الشورى", "فصلت",
                  "غافر", "الزمر", "ص", "الصافات", "يس", "فاطر", "سبأ", "الأحزاب", "السجدة", "لقمان", "الروم", "العنكبوت", "القصص",
                  "النمل", "الشعراء", "الفرقان", "النور", "المومنون", "الحج", "الأنبياء", "طه", "مريم", "الكهف");
        tableView = (TableView< Student>) homeStage.getScene().getRoot().getChildrenUnmodifiable().get(0);
        if (!tableView.getSelectionModel().isEmpty()) {
            Student student = tableView.getSelectionModel().getSelectedItem();
            Id = student.idProperty.get();
            Fname = student.FnameProperty.get();
            Lname = student.LnameProperty.get();
            DateIns = student.DateInsProperty.get();
            de = student.DeProperty.get();
            jusqua = student.jusquaProperty.get();
            txtFName.setText(Fname);
            txtLName.setText(Lname);
            try {
            txtDateIns.setValue(LocalDate.parse(DateIns));
            } catch (Exception e) {
                txtDateIns.setValue(null);
            }
            comboBegin.getSelectionModel().select(de);
            comboEnd.getSelectionModel().select(jusqua);
        }

    }

    @FXML
    private void editStudent() {
        if (!tableView.getSelectionModel().isEmpty()) {
            Fname = txtFName.getText();
            Lname = txtLName.getText();
            try {
                DateIns = txtDateIns.getValue().toString();
            } catch (Exception e) {
                DateIns ="";
            }
            de = comboBegin.getSelectionModel().getSelectedItem();
            jusqua = comboEnd.getSelectionModel().getSelectedItem();
            String sql = String.format("UPDATE student set Fname=\"%s\", Lname =\"%s\",DateIns =\"%s\", de=\"%s\",jusqua=\"%s\"  where ID=\"%d\"",
                      Fname, Lname, DateIns, de, jusqua, Id);
            Tools.executeSQL(sql);
            Tools.fillTable(tableView);
            ToHomeStage();
        }
    }

    @FXML
    private void ToHomeStage() {
        editStage.close();
        Tools.fillTable((TableView<Student>) homeStage.getScene().getRoot().getChildrenUnmodifiable().get(0));
        homeStage.show();
    }
}
