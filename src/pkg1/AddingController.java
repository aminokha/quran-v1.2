package pkg1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static pkg1.Main.addingStage;
import static pkg1.Main.homeStage;

public class AddingController implements Initializable {
    
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
    @FXML
    private JFXButton addButton;

    @Override
    public void initialize( URL url, ResourceBundle rb ) {
        txtDateIns.setValue(LocalDate.now());
        ObservableList<String> list = FXCollections.observableArrayList("الناس", "الفلق", "الاخلاص", "المسد", "النصر", "الكافرون", "الكوثر", "الماعون",
                  "قريش", "الفيل", "الهمزة", "العصر", "التكاثر", "القارعة", "العاديات", "الزلزلة", "البينة", "القدر",
                  "العلق", "التين", "الشرح", "الضحى", "الليل", "الشمس", "البلد", "الفجر", "الغاشية", "الاعلى", "الطارق",
                  "البروج", "الانشقاق", "المطففين", "الانفطار", "التكوير", "عبس", "النازعات", "النبأ", "المرسلات", "الإنسان",
                  "القيامة", "المدثر", "المزمل", "الجن", "نوح", "المعارج", "الحاقة", "القلم", "الملك", "التحريم", "الطلاق", "التغابن",
                  "المنافقون", "الجمعة", "الصف", "الممتحنة", "الحشر", "المجادلة", "الحديد", "الواقعة", "الرحمان", "القمر", "النجم",
                  "الطور", "الذاريات", "ق", "الحجرات", "الفتح", "محمد", "الأحقاف", "الجاثية", "الدخان", "الزخرف", "الشورى",
                  "فصلت", "غافر", "الزمر", "ص", "الصافات", "يس", "فاطر", "سبأ", "الأحزاب", "السجدة", "لقمان", "الروم", "العنكبوت",
                  "القصص", "النمل", "الشعراء", "الفرقان", "النور", "المومنون", "الحج", "الأنبياء", "طه", "مريم", "الكهف");
        comboBegin.setItems(list);
        comboEnd.setItems(list);
        comboBegin.setValue("");
        comboEnd.setValue("");

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
        Tools.executeSQL(sql);
        Tools.fillTable(Main.homeController.tableView);
        new Thread() {
            @Override
            public void run() {
                try {
                    lblActionStatus.setVisible(true);
                    Thread.sleep(1500);
                    lblActionStatus.setOpacity(0.8);
                    Thread.sleep(100);
                    lblActionStatus.setOpacity(0.7);
                    Thread.sleep(100);
                    lblActionStatus.setOpacity(0.6);
                    Thread.sleep(100);
                    lblActionStatus.setOpacity(0.5);
                    Thread.sleep(100);
                    lblActionStatus.setOpacity(0.4);
                    Thread.sleep(100);
                    lblActionStatus.setOpacity(0.3);
                    Thread.sleep(100);
                    lblActionStatus.setOpacity(0.2);
                    Thread.sleep(100);
                    lblActionStatus.setOpacity(0);
                    lblActionStatus.setVisible(false);
                    lblActionStatus.setOpacity(1);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }.start();
        
        

    }

    @FXML
    private void ToHomeStage() {
        addingStage.hide();
        homeStage.show();
    }

}
