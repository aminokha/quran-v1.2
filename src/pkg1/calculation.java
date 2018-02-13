package pkg1;

import java.time.LocalDate;
import java.util.HashMap;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableView;

public class calculation {

    static final HashMap<Integer, Integer> page;
    static final HashMap<String, Integer> BeginPage;
    static final HashMap<String, Integer> EndPage;

    static {
        page = new HashMap<>();
        BeginPage = new HashMap<>();
        EndPage = new HashMap<>();

        //تحميل الصفحات التي لا تحمل علامة الثمن
        page.put(607, 0);
        page.put(606, 0);
        page.put(605, 0);
        page.put(603, 0);
        page.put(601, 0);
        page.put(599, 0);
        page.put(595, 0);
        page.put(590, 0);
        page.put(586, 0);
        page.put(582, 0);
        page.put(575, 0);
        page.put(570, 0);
        page.put(565, 0);
        page.put(558, 0);
        page.put(553, 0);
        page.put(549, 0);
        page.put(547, 0);
        page.put(542, 0);
        page.put(538, 0);
        page.put(533, 0);
        page.put(527, 0);
        page.put(522, 0);
        page.put(513, 0);
        page.put(508, 0);
        page.put(504, 0);
        page.put(502, 0);
        page.put(497, 0);
        page.put(494, 0);
        page.put(490, 0);
        page.put(482, 0);
        page.put(476, 0);
        page.put(472, 0);
        page.put(467, 0);
        page.put(462, 0);
        page.put(458, 0);
        page.put(453, 0);
        page.put(447, 0);
        page.put(442, 0);
        page.put(439, 0);
        page.put(435, 0);
        page.put(428, 0);
        page.put(416, 0);
        page.put(412, 0);
        page.put(410, 0);
        page.put(405, 0);
        page.put(402, 0);
        page.put(397, 0);
        page.put(392, 0);
        page.put(388, 0);
        page.put(382, 0);
        page.put(376, 0);
        page.put(373, 0);
        page.put(367, 0);
        page.put(362, 0);
        page.put(358, 0);
        page.put(351, 0);
        page.put(347, 0);
        page.put(342, 0);
        page.put(338, 0);
        page.put(333, 0);
        page.put(328, 0);
        page.put(321, 0);
        page.put(315, 0);
        page.put(312, 0);
        page.put(308, 0);
        page.put(302, 0);
        page.put(295, 0);

        // تحميل رقم صفحة البداية لكل سورة
        BeginPage.put("الناس", 607);
        BeginPage.put("الفلق", 607);
        BeginPage.put("الاخلاص", 606);
        BeginPage.put("المسد", 606);
        BeginPage.put("النصر", 606);
        BeginPage.put("الكافرون", 605);
        BeginPage.put("الكوثر", 605);
        BeginPage.put("الماعون", 605);
        BeginPage.put("قريش", 604);
        BeginPage.put("الفيل", 604);
        BeginPage.put("الهمزة", 603);
        BeginPage.put("العصر", 603);
        BeginPage.put("التكاثر", 603);
        BeginPage.put("القارعة", 602);
        BeginPage.put("العاديات", 602);
        BeginPage.put("الزلزلة", 601);
        BeginPage.put("البينة", 600);
        BeginPage.put("القدر", 600);
        BeginPage.put("العلق", 599);
        BeginPage.put("التين", 599);
        BeginPage.put("الشرح", 598);
        BeginPage.put("الضحى", 598);
        BeginPage.put("الليل", 597);
        BeginPage.put("الشمس", 596);
        BeginPage.put("البلد", 596);
        BeginPage.put("الفجر", 594);
        BeginPage.put("الغاشية", 593);
        BeginPage.put("الاعلى", 593);
        BeginPage.put("الطارق", 592);
        BeginPage.put("البروج", 591);
        BeginPage.put("الانشقاق", 590);
        BeginPage.put("المطففين", 589);
        BeginPage.put("الانفطار", 588);
        BeginPage.put("التكوير", 587);
        BeginPage.put("عبس", 586);
        BeginPage.put("النازعات", 584);
        BeginPage.put("النبأ", 583);
        BeginPage.put("المرسلات", 581);
        BeginPage.put("الإنسان", 579);
        BeginPage.put("القيامة", 578);
        BeginPage.put("المدثر", 576);
        BeginPage.put("المزمل", 575);
        BeginPage.put("الجن", 573);
        BeginPage.put("نوح", 571);
        BeginPage.put("المعارج", 569);
        BeginPage.put("الحاقة", 567);
        BeginPage.put("القلم", 565);
        BeginPage.put("الملك", 563);
        BeginPage.put("التحريم", 561);
        BeginPage.put("الطلاق", 559);
        BeginPage.put("التغابن", 557);
        BeginPage.put("المنافقون", 555);
        BeginPage.put("الجمعة", 554);
        BeginPage.put("الصف", 552);
        BeginPage.put("الممتحنة", 550);
        BeginPage.put("الحشر", 546);
        BeginPage.put("المجادلة", 543);
        BeginPage.put("الحديد", 538);
        BeginPage.put("الواقعة", 535);
        BeginPage.put("الرحمان", 532);
        BeginPage.put("القمر", 529);
        BeginPage.put("النجم", 527);
        BeginPage.put("الطور", 524);
        BeginPage.put("الذاريات", 521);
        BeginPage.put("ق", 519);
        BeginPage.put("الحجرات", 516);
        BeginPage.put("الفتح", 512);
        BeginPage.put("محمد", 508);
        BeginPage.put("الأحقاف", 503);
        BeginPage.put("الجاثية", 499);
        BeginPage.put("الدخان", 497);
        BeginPage.put("الزخرف", 490);
        BeginPage.put("الشورى", 484);
        BeginPage.put("فصلت", 478);
        BeginPage.put("غافر", 468);
        BeginPage.put("الزمر", 459);
        BeginPage.put("ص", 454);
        BeginPage.put("الصافات", 447);
        BeginPage.put("يس", 441);
        BeginPage.put("فاطر", 435);
        BeginPage.put("سبأ", 429);
        BeginPage.put("الأحزاب", 419);
        BeginPage.put("السجدة", 416);
        BeginPage.put("لقمان", 412);
        BeginPage.put("الروم", 405);
        BeginPage.put("العنكبوت", 397);
        BeginPage.put("القصص", 386);
        BeginPage.put("النمل", 378);
        BeginPage.put("الشعراء", 368);
        BeginPage.put("الفرقان", 360);
        BeginPage.put("النور", 351);
        BeginPage.put("المومنون", 343);
        BeginPage.put("الحج", 332);
        BeginPage.put("الأنبياء", 323);
        BeginPage.put("طه", 313);
        BeginPage.put("مريم", 306);
        BeginPage.put("الكهف", 294);
        //##################### تحميل رقم صفحة النهاية لكل سورة
        EndPage.put("الناس", 607);
        EndPage.put("الفلق", 607);
        EndPage.put("الاخلاص", 606);
        EndPage.put("المسد", 606);
        EndPage.put("النصر", 606);
        EndPage.put("الكافرون", 605);
        EndPage.put("الكوثر", 605);
        EndPage.put("الماعون", 605);
        EndPage.put("قريش", 604);
        EndPage.put("الفيل", 604);
        EndPage.put("الهمزة", 604);
        EndPage.put("العصر", 603);
        EndPage.put("التكاثر", 603);
        EndPage.put("القارعة", 602);
        EndPage.put("العاديات", 602);
        EndPage.put("الزلزلة", 601);
        EndPage.put("البينة", 601);
        EndPage.put("القدر", 600);
        EndPage.put("العلق", 600);
        EndPage.put("التين", 599);
        EndPage.put("الشرح", 599);
        EndPage.put("الضحى", 598);
        EndPage.put("الليل", 598);
        EndPage.put("الشمس", 597);
        EndPage.put("البلد", 596);
        EndPage.put("الفجر", 595);
        EndPage.put("الغاشية", 594);
        EndPage.put("الاعلى", 593);
        EndPage.put("الطارق", 593);
        EndPage.put("البروج", 592);
        EndPage.put("الانشقاق", 591);
        EndPage.put("المطففين", 590);
        EndPage.put("الانفطار", 588);
        EndPage.put("التكوير", 588);
        EndPage.put("عبس", 587);
        EndPage.put("النازعات", 585);
        EndPage.put("النبأ", 584);
        EndPage.put("المرسلات", 582);
        EndPage.put("الإنسان", 581);
        EndPage.put("القيامة", 579);
        EndPage.put("المدثر", 578);
        EndPage.put("المزمل", 576);
        EndPage.put("الجن", 574);
        EndPage.put("نوح", 572);
        EndPage.put("المعارج", 581);
        EndPage.put("الحاقة", 569);
        EndPage.put("القلم", 567);
        EndPage.put("الملك", 565);
        EndPage.put("التحريم", 562);
        EndPage.put("الطلاق", 560);
        EndPage.put("التغابن", 558);
        EndPage.put("المنافقون", 556);
        EndPage.put("الجمعة", 555);
        EndPage.put("الصف", 553);
        EndPage.put("الممتحنة", 552);
        EndPage.put("الحشر", 549);
        EndPage.put("المجادلة", 546);
        EndPage.put("الحديد", 542);
        EndPage.put("الواقعة", 538);
        EndPage.put("الرحمان", 535);
        EndPage.put("القمر", 532);
        EndPage.put("النجم", 529);
        EndPage.put("الطور", 526);
        EndPage.put("الذاريات", 524);
        EndPage.put("ق", 521);
        EndPage.put("الحجرات", 518);
        EndPage.put("الفتح", 516);
        EndPage.put("محمد", 511);
        EndPage.put("الأحقاف", 508);
        EndPage.put("الجاثية", 502);
        EndPage.put("الدخان", 499);
        EndPage.put("الزخرف", 496);
        EndPage.put("الشورى", 490);
        EndPage.put("فصلت", 483);
        EndPage.put("غافر", 477);
        EndPage.put("الزمر", 468);
        EndPage.put("ص", 459);
        EndPage.put("الصافات", 453);
        EndPage.put("يس", 446);
        EndPage.put("فاطر", 441);
        EndPage.put("سبأ", 435);
        EndPage.put("الأحزاب", 428);
        EndPage.put("السجدة", 418);
        EndPage.put("لقمان", 415);
        EndPage.put("الروم", 411);
        EndPage.put("العنكبوت", 405);
        EndPage.put("القصص", 397);
        EndPage.put("النمل", 386);
        EndPage.put("الشعراء", 377);
        EndPage.put("الفرقان", 367);
        EndPage.put("النور", 360);
        EndPage.put("المومنون", 350);
        EndPage.put("الحج", 342);
        EndPage.put("الأنبياء", 332);
        EndPage.put("طه", 322);
        EndPage.put("مريم", 312);
        EndPage.put("الكهف", 305);
    }

    public static void calculate( TableView<Student> tableView, LocalDate date_End ) {

        for (int i = 0; i < tableView.getItems().size(); i++) {
            Student student = tableView.getItems().get(i);
            //calculate the period in months 
            LocalDate dateIns = null;
            int nbrOfMonths = 0;
            try {
                dateIns = LocalDate.parse(student.DateInsProperty.get());
                nbrOfMonths = dateIns.until(date_End).getMonths();
                nbrOfMonths += dateIns.until(date_End).getYears() * 12;
            } catch (Exception e) {
            }

            if (nbrOfMonths == 1) {
                student.PeriodProperty = new SimpleStringProperty("شهر واحد");
            } else if (nbrOfMonths == 2) {
                student.PeriodProperty = new SimpleStringProperty("شهرين");
            } else if (nbrOfMonths >= 3 && nbrOfMonths <= 10) {
                student.PeriodProperty = new SimpleStringProperty(String.format("%d أشهر", nbrOfMonths));
            } else if (nbrOfMonths == 11) {
                student.PeriodProperty = new SimpleStringProperty(String.format("%d شهرا", nbrOfMonths));
            } else if (nbrOfMonths > 11) {
                student.PeriodProperty = new SimpleStringProperty(String.format("%d سنة و%d شهر", nbrOfMonths / 12,nbrOfMonths % 12));
            }
            //###################### حساب عدد الأثمان و الأحزاب المحفوظةوإضافتها للجدول#########################
            //NbrOf_8 لتخزين عدد الأثمان
            int NbrOf_8 = get_NbrOf_8(student.DeProperty.get(), student.jusquaProperty.get());
            student.nbrDe8Property.set(String.valueOf(NbrOf_8));
            //############### حساب اجمالي الحفظ
            int ahzab = NbrOf_8 / 8;
            String result = String.valueOf(ahzab);
            if (ahzab == 0) {
                result = "";
            }
            if (ahzab == 1) {
                result = "حزب ";
            }
            if (ahzab == 2) {
                result = "حزبان ";
            }
            if (ahzab >= 3 && ahzab <= 10) {
                result = result.concat(" أحزاب ");
            }
            if (ahzab > 10) {
                result = result.concat(" حزب ");
            }
            /////////////////////////////////////////
            if (!result.isEmpty()) {
                result = result.concat("و ");
            }
            if (NbrOf_8 % 8 == 0) {
                result = result.replace("و", "");
            }
            if (NbrOf_8 % 8 == 1) {
                result = result.concat("ثمن");
            }
            if (NbrOf_8 % 8 == 2) {
                result = result.concat("ثمنان");
            }
            if (NbrOf_8 % 8 >= 3) {
                result = result.concat(String.valueOf(NbrOf_8 % 8));
                result = result.concat(" أثمان");
            }

            student.TotalProperty.set(result);
        }
        tableView.refresh();
    }

    public static int get_NbrOf_8( String de, String jusqua ) {
        int start = 0;
        int end = 0;
        try {
            start = EndPage.get(de);
            end = BeginPage.get(jusqua);
        } catch (NullPointerException e) {
            return 0;
        }
        int total = 0;
        for (int i = start; i >= end; i--) {
            total += page.getOrDefault(i, 1);
        }
        return total;
    }
}
