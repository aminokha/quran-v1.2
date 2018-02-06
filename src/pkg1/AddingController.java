package pkg1;

import com.jfoenix.controls.JFXDatePicker;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AddingController implements Initializable {

    @FXML
    private TextField txtFName;
    @FXML
    private TextField txtLName;
    @FXML
    private JFXDatePicker txtDateIns;
    @FXML
    private ComboBox<String> comboBegin;
    @FXML
    private ComboBox<String> comboEnd;

    @FXML
    private Label lblAddingStatus;

    @Override
    public void initialize( URL url, ResourceBundle rb ) {
        txtDateIns.setValue(LocalDate.now());
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

    }

    @FXML
    private void AddStudent() throws IOException {
        int id = ++Main.lastID;
        String fname = txtFName.getText();
        String lname = txtLName.getText();
        String dateIns = "";
        try {
            dateIns = txtDateIns.getValue().toString();
        } catch (Exception e) {
        }
        String de = "";
        String jusqua = "";
        de = comboBegin.getSelectionModel().getSelectedItem() == (null) ? "" : comboBegin.getSelectionModel().getSelectedItem();
        jusqua = comboEnd.getSelectionModel().getSelectedItem() == (null) ? "" : comboEnd.getSelectionModel().getSelectedItem();

        String sql = String.format("insert into student (id,fname,lname,dateins,de,jusqua) values (%d,\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")", id, fname, lname, dateIns, de, jusqua);
        Tools.insert(sql);
        new Thread() {
            @Override
            public void run() {
                try {
                    lblAddingStatus.setVisible(true);
                    Thread.sleep(1500);
                    lblAddingStatus.setOpacity(0.8);
                    Thread.sleep(100);
                    lblAddingStatus.setOpacity(0.7);
                    Thread.sleep(100);
                    lblAddingStatus.setOpacity(0.6);
                    Thread.sleep(100);
                    lblAddingStatus.setOpacity(0.5);
                    Thread.sleep(100);
                    lblAddingStatus.setOpacity(0.4);
                    Thread.sleep(100);
                    lblAddingStatus.setOpacity(0.3);
                    Thread.sleep(100);
                    lblAddingStatus.setOpacity(0.2);
                    Thread.sleep(100);
                    lblAddingStatus.setOpacity(0);
                    lblAddingStatus.setVisible(false);
                    lblAddingStatus.setOpacity(1);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }.start();

    }

    @FXML
    private void ToHomeStage() {
        Main.addingStage.hide();
        Tools.fillTable((TableView<Student>) Main.homeStage.getScene().getRoot().getChildrenUnmodifiable().get(0));
        Main.homeStage.show();
    }

}
