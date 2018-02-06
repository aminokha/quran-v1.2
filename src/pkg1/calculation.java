package pkg1;

import java.time.LocalDate;
import java.util.HashMap;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableView;

public class calculation {

    static HashMap<Integer, Integer> page;
    static HashMap<String, Integer> BeginPage;
    static HashMap<String, Integer> EndPage;

    static {
        page = new HashMap<>();
        BeginPage = new HashMap<>();
        EndPage = new HashMap<>();
        //تحميل الصفحات التي تحمل علامة الثمن
        page.put(604, 1);
        page.put(602, 1);
        page.put(600, 1);
        page.put(598, 1);
        page.put(597, 1);
        page.put(596, 1);
        page.put(594, 1);
        page.put(593, 1);
        page.put(592, 1);
        page.put(591, 1);
        page.put(589, 1);
        page.put(588, 1);
        page.put(587, 1);
        page.put(585, 1);
        page.put(584, 1);
        page.put(583, 1);
        page.put(581, 1);
        page.put(580, 1);
        page.put(579, 1);
        page.put(578, 1);
        page.put(577, 1);
        page.put(576, 1);
        page.put(574, 1);
        page.put(573, 1);
        page.put(572, 1);
        page.put(571, 1);
        page.put(569, 1);
        page.put(568, 1);
        page.put(567, 1);
        page.put(566, 1);
        page.put(564, 1);
        page.put(563, 1);
        page.put(562, 1);
        page.put(561, 1);
        page.put(560, 1);
        page.put(559, 1);
        page.put(557, 1);
        page.put(556, 1);
        page.put(555, 1);
        page.put(554, 1);
        page.put(552, 1);
        page.put(551, 1);
        page.put(550, 1);
        page.put(548, 1);
        page.put(546, 1);
        page.put(545, 1);
        page.put(544, 1);
        page.put(543, 1);
        page.put(541, 1);
        page.put(540, 1);
        page.put(539, 1);
        page.put(537, 1);
        page.put(536, 1);
        page.put(535, 1);
        page.put(534, 1);
        page.put(532, 1);
        page.put(531, 1);
        page.put(530, 1);
        page.put(529, 1);
        page.put(528, 1);
        page.put(526, 1);
        page.put(525, 1);
        page.put(524, 1);
        page.put(523, 1);
        page.put(521, 1);
        page.put(520, 1);
        page.put(519, 1);
        page.put(518, 1);
        page.put(517, 1);
        page.put(516, 1);
        page.put(515, 1);
        page.put(514, 1);
        page.put(512, 1);
        page.put(511, 1);
        page.put(5010, 1);
        page.put(509, 1);
        page.put(507, 1);
        page.put(506, 1);
        page.put(505, 1);
        page.put(503, 1);
        page.put(501, 1);
        page.put(500, 1);
        page.put(499, 1);
        page.put(498, 1);
        page.put(496, 1);
        page.put(495, 1);
        page.put(493, 1);
        page.put(492, 1);
        page.put(491, 1);
        page.put(489, 1);
        page.put(488, 1);
        page.put(487, 1);
        page.put(486, 1);
        page.put(485, 1);
        page.put(484, 1);
        page.put(483, 1);
        page.put(481, 1);
        page.put(480, 1);
        page.put(479, 1);
        page.put(478, 1);
        page.put(477, 1);
        page.put(475, 1);
        page.put(474, 1);
        page.put(473, 1);
        page.put(471, 1);
        page.put(470, 1);
        page.put(469, 1);
        page.put(468, 1);
        page.put(466, 1);
        page.put(465, 1);
        page.put(464, 1);
        page.put(463, 1);
        page.put(461, 1);
        page.put(460, 1);
        page.put(459, 1);
        page.put(457, 1);
        page.put(456, 1);
        page.put(455, 1);
        page.put(454, 1);
        page.put(452, 1);
        page.put(451, 1);
        page.put(450, 1);
        page.put(449, 1);
        page.put(448, 1);
        page.put(446, 1);
        page.put(445, 1);
        page.put(444, 1);
        page.put(443, 1);
        page.put(441, 1);
        page.put(440, 1);
        page.put(438, 1);
        page.put(437, 1);
        page.put(436, 1);
        page.put(434, 1);
        page.put(433, 1);
        page.put(432, 1);
        page.put(431, 1);
        page.put(430, 1);
        page.put(429, 1);
        page.put(427, 1);
        page.put(426, 1);
        page.put(425, 1);
        page.put(424, 1);
        page.put(423, 1);
        page.put(422, 1);
        page.put(421, 1);
        page.put(420, 1);
        page.put(419, 1);
        page.put(418, 1);
        page.put(417, 1);
        page.put(415, 1);
        page.put(414, 1);
        page.put(413, 1);
        page.put(411, 1);
        page.put(409, 1);
        page.put(408, 1);
        page.put(407, 1);
        page.put(406, 1);
        page.put(404, 1);
        page.put(403, 1);
        page.put(401, 1);
        page.put(400, 1);
        page.put(399, 1);
        page.put(398, 1);
        page.put(396, 1);
        page.put(395, 1);
        page.put(394, 1);
        page.put(393, 1);
        page.put(391, 1);
        page.put(390, 1);
        page.put(389, 1);
        page.put(387, 1);
        page.put(386, 1);
        page.put(385, 1);
        page.put(384, 1);
        page.put(383, 1);
        page.put(381, 1);
        page.put(380, 1);
        page.put(379, 1);
        page.put(378, 1);
        page.put(377, 1);
        page.put(375, 1);
        page.put(374, 1);
        page.put(372, 1);
        page.put(371, 1);
        page.put(370, 1);
        page.put(369, 1);
        page.put(368, 1);
        page.put(366, 1);
        page.put(365, 1);
        page.put(364, 1);
        page.put(363, 1);
        page.put(361, 1);
        page.put(360, 1);
        page.put(359, 1);
        page.put(357, 1);
        page.put(356, 1);
        page.put(355, 1);
        page.put(354, 1);
        page.put(353, 1);
        page.put(352, 1);
        page.put(350, 1);
        page.put(349, 1);
        page.put(348, 1);
        page.put(346, 1);
        page.put(345, 1);
        page.put(344, 1);
        page.put(343, 1);
        page.put(341, 1);
        page.put(340, 1);
        page.put(339, 1);
        page.put(337, 1);
        page.put(336, 1);
        page.put(335, 1);
        page.put(334, 1);
        page.put(332, 1);
        page.put(331, 1);
        page.put(330, 1);
        page.put(329, 1);
        page.put(327, 1);
        page.put(326, 1);
        page.put(325, 1);
        page.put(324, 1);
        page.put(323, 1);
        page.put(322, 1);
        page.put(320, 1);
        page.put(319, 1);
        page.put(318, 1);
        page.put(317, 1);
        page.put(316, 1);
        page.put(314, 1);
        page.put(313, 1);
        page.put(311, 1);
        page.put(310, 1);
        page.put(309, 1);
        page.put(307, 1);
        page.put(306, 1);
        page.put(305, 1);
        page.put(304, 1);
        page.put(303, 1);
        page.put(301, 1);
        page.put(300, 1);
        page.put(299, 1);
        page.put(298, 1);
        page.put(297, 1);
        page.put(296, 1);
        page.put(294, 1);

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
            } else if (nbrOfMonths > 2 && nbrOfMonths < 11) {
                student.PeriodProperty = new SimpleStringProperty(String.format("%d أشهر", nbrOfMonths));
            } else if (nbrOfMonths > 10) {
                student.PeriodProperty = new SimpleStringProperty(String.format("%d شهرا", nbrOfMonths));
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
        }
        int total = 0;
        for (int i = start; i >= end; i--) {
            total += page.getOrDefault(i, 0);
        }
        return total;
    }
}
