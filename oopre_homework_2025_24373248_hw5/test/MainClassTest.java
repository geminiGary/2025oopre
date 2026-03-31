import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClassTest {

    @Test
    public void addAdventurer() {
        Adventurer adventurer1 = new Adventurer("8kkY");
        Adventurer adventurer2 = new Adventurer("x");
        Adventurer adventurer3 = new Adventurer("uix4d9jo");
        Adventurer adventurer4 = new Adventurer("hlmEg84oSaeHU");
        Adventurer adventurer5 = new Adventurer("vekV");
        MainClass.addAdventurer(adventurer1);
        MainClass.addAdventurer(adventurer2);
        MainClass.addAdventurer(adventurer3);
        MainClass.addAdventurer(adventurer4);
        MainClass.addAdventurer(adventurer5);
        MainClass.addEquipment("hlmEg84oSaeHU", "S", "Sword", 144);
        MainClass.takeItem("hlmEg84oSaeHU", "S");
        MainClass.addEquipment("hlmEg84oSaeHU", "yjrNAPDPOkWqf", "Sword", 268);
        MainClass.takeItem("hlmEg84oSaeHU", "yjrNAPDPOkWqf");
        MainClass.learnSpell("uix4d9jo", "7upTxCtA63tBtekj", "AttackSpell", 19, 186);
        MainClass.buyItem("vekV", "PJk2UeeqSPnD8Nrp", "Sword");
        MainClass.addEquipment("hlmEg84oSaeHU", "GyDcYALt3z8xyEPe", "Magicbook", 294);
        MainClass.takeItem("hlmEg84oSaeHU", "GyDcYALt3z8xyEPe");
        MainClass.fight("hlmEg84oSaeHU", new ArrayList<>(Arrays.asList(adventurer5)));
        MainClass.addEquipment("8kkY", "kmKj5iCv7aE", "Sword", 78);
        MainClass.takeItem("8kkY", "kmKj5iCv7aE");
        MainClass.addEquipment("8kkY", "vqQeOWREae6TWD", "Sword", 209);
        MainClass.takeItem("8kkY", "vqQeOWREae6TWD");
        MainClass.learnSpell("hlmEg84oSaeHU", "maRjPJrnMC5Fd", "AttackSpell", 10, 50);
        MainClass.use("hlmEg84oSaeHU", "maRjPJrnMC5Fd", "8kkY");
        MainClass.use("hlmEg84oSaeHU", "maRjPJrnMC5Fd", "vekV");
        MainClass.addEquipment("uix4d9jo", "8MhE", "Sword", 97);
        MainClass.takeItem("uix4d9jo", "8MhE");
        MainClass.addEquipment("uix4d9jo", "b", "Sword", 286);
        MainClass.takeItem("uix4d9jo", "b");
        MainClass.addEquipment("uix4d9jo", "cxnt9tjWO", "Sword", 269);
        MainClass.takeItem("uix4d9jo", "cxnt9tjWO");
        MainClass.fight("uix4d9jo", new ArrayList<>(Arrays.asList(adventurer2, adventurer5)));
        MainClass.removeItem("vekV", "PJk2UeeqqSPnD8Nrp");
        MainClass.addBottle("x", "pdreEmW2B", "AtkBottle", 269);
        MainClass.takeItem("x", "pdreEmW2B");
        MainClass.use("x", "pdreEmW2B", "x");
        MainClass.learnSpell("8kkY", "he2Mw9VG", "AttackSpell", 10, 50);
        MainClass.use("8kkY", "he2Mw9VG", "uix4d9jo");
        MainClass.addBottle("hlmEg84oSaeHU", "KPr6N9cB5MZV", "AtkBottle", 50);
        MainClass.takeItem("hlmEg84oSaeHU", "KPr6N9cB5MZV");
        MainClass.use("hlmEg84oSaeHU", "KPr6N9cB5MZV", "vekV");
        MainClass.addEquipment("uix4d9jo", "DmoS0IA5W4rIyzb8", "Sword", 225);
        MainClass.takeItem("uix4d9jo", "DmoS0IA5W4rIyzb8");
        MainClass.fight("uix4d9jo", new ArrayList<>(Arrays.asList(adventurer1, adventurer5, adventurer4)));
        MainClass.addBottle("uix4d9jo", "SL5FWr", "HpBottle", 753);
        MainClass.takeItem("uix4d9jo", "SL5FWr");
        MainClass.use("uix4d9jo", "SL5FWr", "uix4d9jo");
        MainClass.use("8kkY", "he2Mw9VG", "x");
        MainClass.addEquipment("hlmEg84oSaeHU", "PmoZIbCTz2PhG373", "Magicbook", 146);
        MainClass.takeItem("hlmEg84oSaeHU", "PmoZIbCTz2PhG373");
        MainClass.fight("hlmEg84oSaeHU", new ArrayList<>(Arrays.asList(adventurer1, adventurer5, adventurer2)));
        MainClass.addEquipment("8kkY", "ui", "Sword", 122);
        MainClass.takeItem("8kkY", "ui");
        MainClass.fight("8kkY", new ArrayList<>(Arrays.asList(adventurer5, adventurer4, adventurer2)));
    }


    /*aa 8kkY
    aa x
    aa uix4d9jo
    aa hlmEg84oSaeHU
    aa vekV
    ae hlmEg84oSaeHU S Sword 144
    ti hlmEg84oSaeHU S
    ae hlmEg84oSaeHU yjrNAPDPOkWqf Sword 268
    ti hlmEg84oSaeHU yjrNAPDPOkWqf
    ls uix4d9jo 7upTxCtA63tBtekj AttackSpell 19 186
    bi vekV PJk2UeeqSPnD8Nrp Sword
    ae hlmEg84oSaeHU GyDcYALt3z8xyEPe Magicbook 294
    ti hlmEg84oSaeHU GyDcYALt3z8xyEPe
    fight hlmEg84oSaeHU 1 vekV
    ae 8kkY kmKj5iCv7aE Sword 78
    ti 8kkY kmKj5iCv7aE
    ae 8kkY vqQeOWREae6TWD Sword 209
    ti 8kkY vqQeOWREae6TWD
    ls hlmEg84oSaeHU maRjPJrnMC5Fd AttackSpell 10 50
    use hlmEg84oSaeHU maRjPJrnMC5Fd 8kkY
    use hlmEg84oSaeHU maRjPJrnMC5Fd vekV
    ae uix4d9jo 8MhE Sword 97
    ti uix4d9jo 8MhE
    ae uix4d9jo b Sword 286
    ti uix4d9jo b
    ae uix4d9jo cxnt9tjWO Sword 269
    ti uix4d9jo cxnt9tjWO
    fight uix4d9jo 2 x vekV
    ri vekV PJk2UeeqSPnD8Nrp
    ab x pdreEmW2B AtkBottle 269
    ti x pdreEmW2B
    use x pdreEmW2B x
    ls 8kkY he2Mw9VG AttackSpell 10 50
    use 8kkY he2Mw9VG uix4d9jo
    ab hlmEg84oSaeHU KPr6N9cB5MZV AtkBottle 50
    ti hlmEg84oSaeHU KPr6N9cB5MZV
    use hlmEg84oSaeHU KPr6N9cB5MZV vekV
    ae uix4d9jo DmoS0IA5W4rIyzb8 Sword 225
    ti uix4d9jo DmoS0IA5W4rIyzb8
    fight uix4d9jo 3 8kkY vekV hlmEg84oSaeHU
    ab uix4d9jo SL5FWr HpBottle 753
    ti uix4d9jo SL5FWr
    use uix4d9jo SL5FWr uix4d9jo
    use 8kkY he2Mw9VG x
    ae hlmEg84oSaeHU PmoZIbCTz2PhG373 Magicbook 146
    ti hlmEg84oSaeHU PmoZIbCTz2PhG373
    fight hlmEg84oSaeHU 3 8kkY vekV x
    ae 8kkY ui Sword 122
    ti 8kkY ui
    fight 8kkY 3 vekV hlmEg84oSaeHU x*/
    @Test
    public void addBottle() {
        Adventurer adventurer6 = new Adventurer("kkrAw9eM");
        Adventurer adventurer7 = new Adventurer("cfpjMvZclvIW58KyV");
        Adventurer adventurer8 = new Adventurer("8fgmjnrEaD5VSrSGgZ");
        Adventurer adventurer9 = new Adventurer("vLfelCti-h_pxJe19tNOj");
        Adventurer adventurer10 = new Adventurer("JU_");
        Adventurer adventurer11 = new Adventurer("krAw9eM");
        Adventurer adventurer12 = new Adventurer("64Vr5");
        MainClass.addAdventurer(adventurer6);
        MainClass.addAdventurer(adventurer7);
        MainClass.addAdventurer(adventurer8);
        MainClass.addAdventurer(adventurer9);
        MainClass.addAdventurer(adventurer10);
        MainClass.addAdventurer(adventurer11);
        MainClass.addAdventurer(adventurer12);
        MainClass.addEquipment("64Vr5", "wEqz0IQ", "Sword", 125);
        MainClass.takeItem("64Vr5", "wEqz0IQ");
        MainClass.addEquipment("64Vr5", "GYyrU1aOp1OpGUpN1kMi", "Sword", 245);
        MainClass.takeItem("64Vr5", "GYyrU1aOp1OpGUpN1kMi");
        MainClass.learnSpell("kkrAw9eM", "UehPamoo5QOOcebObQUc-i", "AttackSpell", 10, 50);
        MainClass.use("kkrAw9eM", "UehPamoo5QOOcebObQUc-i", "hFQ75F27_LHYfVzyoXx");
        MainClass.addEquipment("8fgmjnrEaD5VSrSGgZ", "3lZSapWWeNExq5zwrUHY3uiQ", "Sword", 102);
        MainClass.takeItem("8fgmjnrEaD5VSrSGgZ", "3lZSapWWeNExq5zwrUHY3uiQ");
        MainClass.addEquipment("8fgmjnrEaD5VSrSGgZ", "fZPN", "Sword", 281);
        MainClass.takeItem("8fgmjnrEaD5VSrSGgZ", "fZPN");
        MainClass.learnSpell("hFQ75F27_LHYfVzyoXx", "g6k7deu5strv29aS90J", "HealSpell", 8, 110);
        MainClass.use("kkrAw9eM", "UehPamoo5QOOcebObQUc-i", "64Vr5");
        MainClass.addBottle("kkrAw9eM", "McG3", "HpBottle", 319);
        MainClass.takeItem("kkrAw9eM", "McG3");
        MainClass.use("kkrAw9eM", "McG3", "kkrAw9eM");
        MainClass.addEquipment("64Vr5", "eTApu52HMTE543mcZdq68T3", "Sword", 110);
        MainClass.takeItem("64Vr5", "eTApu52HMTE543mcZdq68T3");
        MainClass.addEquipment("64Vr5", "95r9XB8IP1PC", "Sword", 166);
        MainClass.takeItem("64Vr5", "95r9XB8IP1PC");
        MainClass.addBottle("64Vr5", "LTkhR", "HpBottle", 134);
        MainClass.takeItem("64Vr5", "LTkhR");
        MainClass.use("64Vr5", "LTkhR", "64Vr5");
        MainClass.addBottle("JU_", "2_orHt1cevO0Lh5G3w", "HpBottle", 38);
        MainClass.takeItem("JU_", "2_orHt1cevO0Lh5G3w");
        MainClass.use("JU_", "2_orHt1cevO0Lh5G3w", "JU_");
        MainClass.removeItem("64Vr5", "wEqz0IQ");
        MainClass.buyItem("vLfelCti-h_pxJe19tNOj", "B-8ktJDFvuKEAIeRNLvRRDEn", "ManaBottle");
        MainClass.addBottle("vLfelCti-h_pxJe19tNOj", "oAjJeMsB-Ww-G3cD4", "ManaBottle", 750);
        MainClass.takeItem("vLfelCti-h_pxJe19tNOj", "oAjJeMsB-Ww-G3cD4");
        MainClass.use("vLfelCti-h_pxJe19tNOj", "oAjJeMsB-Ww-G3cD4", "vLfelCti-h_pxJe19tNOj");
        MainClass.learnSpell("cfpjMvZclvIW58KyV", "rWc5pPRe", "AttackSpell", 6, 98);
        MainClass.learnSpell("vLfelCti-h_pxJe19tNOj", "mrNeadEQtGNyy8b", "AttackSpell", 10, 50);
        MainClass.use("vLfelCti-h_pxJe19tNOj", "mrNeadEQtGNyy8b", "kkrAw9eM");
        MainClass.addEquipment("8fgmjnrEaD5VSrSGgZ", "Gr-z5MFEZsEZtI", "Sword", 131);
        MainClass.takeItem("8fgmjnrEaD5VSrSGgZ", "Gr-z5MFEZsEZtI");
        MainClass.addEquipment("8fgmjnrEaD5VSrSGgZ", "Hnf7Ua26iscPMqsV-ZJ", "Sword", 120);
        MainClass.takeItem("8fgmjnrEaD5VSrSGgZ", "Hnf7Ua26iscPMqsV-ZJ");
        MainClass.learnSpell("64Vr5", "c7mjOjpnRXurU7", "HealSpell", 2, 175);
        MainClass.addBottle("cfpjMvZclvIW58KyV", "uXC", "DefBottle", 50);
        MainClass.takeItem("cfpjMvZclvIW58KyV", "uXC");
        MainClass.use("cfpjMvZclvIW58KyV", "uXC", "8fgmjnrEaD5VSrSGgZ");
        MainClass.addEquipment("hFQ75F27_LHYfVzyoXx", "zxq", "Sword", 220);
        MainClass.takeItem("hFQ75F27_LHYfVzyoXx", "zxq");
        MainClass.fight("hFQ75F27_LHYfVzyoXx", new ArrayList<>(Arrays.asList(adventurer10, adventurer7, adventurer8)));
        MainClass.addEquipment("vLfelCti-h_pxJe19tNOj", "yZ0UtIfp", "Magicbook", 284);
        MainClass.takeItem("vLfelCti-h_pxJe19tNOj", "yZ0UtIfp");
        MainClass.fight("vLfelCti-h_pxJe19tNOj", new ArrayList<>(Arrays.asList(adventurer6, adventurer8, adventurer7)));
        MainClass.learnSpell("cfpjMvZclvIW58KyV", "Wsmg", "AttackSpell", 13, 300);
        MainClass.addEquipment("JU_", "fw8_c01mimROYmwEPZQntgQr", "Sword", 342);
        MainClass.takeItem("JU_", "fw8_c01mimROYmwEPZQntgQr");
        MainClass.fight("JU_", new ArrayList<>(Arrays.asList(adventurer9, adventurer8, adventurer7)));
        MainClass.addEquipment("8fgmjnrEaD5VSrSGgZ", "o2in0cc_HzPUT4pjoUd8", "Armour", 100);
        MainClass.addBottle("hFQ75F27_LHYfVzyoXx", "xXv", "HpBottle", 1000);
        MainClass.takeItem("hFQ75F27_LHYfVzyoXx", "xXv");
        MainClass.use("hFQ75F27_LHYfVzyoXx", "xXv", "8fgmjnrEaD5VSrSGgZ");
        MainClass.addEquipment("8fgmjnrEaD5VSrSGgZ", "1YRzknTLTl1XPjO", "Armour", 100);
        MainClass.addBottle("vLfelCti-h_pxJe19tNOj", "iXyEqwfo9yUW1kL", "HpBottle", 1000);
        MainClass.takeItem("vLfelCti-h_pxJe19tNOj", "iXyEqwfo9yUW1kL");
        MainClass.use("vLfelCti-h_pxJe19tNOj", "iXyEqwfo9yUW1kL", "8fgmjnrEaD5VSrSGgZ");
        MainClass.addEquipment("JU_", "AyU-yUN6McjuKaSl0dnzZF5C", "Sword", 221);
        MainClass.takeItem("JU_", "AyU-yUN6McjuKaSl0dnzZF5C");
        MainClass.fight("JU_", new ArrayList<>(Arrays.asList(adventurer6)));
        MainClass.buyItem("hFQ75F27_LHYfVzyoXx", "ZI3VpRFjofTWPe4fp", "HpBottle");

        //300
        //aa   kkrAw9eM
        //aa cfpjMvZclvIW58KyV
        //aa    8fgmjnrEaD5VSrSGgZ
        //aa   vLfelCti-h_pxJe19tNOj
        //aa    JU_
        //aa    hFQ75F27_LHYfVzyoXx
        //aa 64Vr5
        //ae    64Vr5    wEqz0IQ   Sword    125
        //ti 64Vr5  wEqz0IQ
        //ae     64Vr5  GYyrU1aOp1OpGUpN1kMi  Sword    245
        //ti    64Vr5 GYyrU1aOp1OpGUpN1kMi
        //ls    kkrAw9eM   UehPamoo5QOOcebObQUc-i  AttackSpell  10  50
        //use    kkrAw9eM  UehPamoo5QOOcebObQUc-i hFQ75F27_LHYfVzyoXx
        //ae   8fgmjnrEaD5VSrSGgZ   3lZSapWWeNExq5zwrUHY3uiQ Sword   102
        //ti 8fgmjnrEaD5VSrSGgZ  3lZSapWWeNExq5zwrUHY3uiQ
        //ae     8fgmjnrEaD5VSrSGgZ   fZPN    Sword  281
        //ti     8fgmjnrEaD5VSrSGgZ  fZPN
        //ls hFQ75F27_LHYfVzyoXx     g6k7deu5strv29aS90J HealSpell   8 110
        //use    kkrAw9eM     UehPamoo5QOOcebObQUc-i 64Vr5
        //ab kkrAw9eM   McG3     HpBottle     319
        //ti   kkrAw9eM  McG3
        //use   kkrAw9eM   McG3    kkrAw9eM
        //ae    64Vr5   eTApu52HMTE543mcZdq68T3   Sword  110
        //ti     64Vr5     eTApu52HMTE543mcZdq68T3
        //ae   64Vr5 95r9XB8IP1PC     Sword 166
        //ti     64Vr5   95r9XB8IP1PC
        //ab   64Vr5  LTkhR   HpBottle   134
        //ti    64Vr5    LTkhR
        //use     64Vr5   LTkhR    64Vr5
        //ab     JU_     2_orHt1cevO0Lh5G3w     HpBottle  38
        //ti JU_  2_orHt1cevO0Lh5G3w
        //use   JU_  2_orHt1cevO0Lh5G3w JU_
        //ri     64Vr5     wEqz0IQ
        //bi vLfelCti-h_pxJe19tNOj    B-8ktJDFvuKEAIeRNLvRRDEn  ManaBottle
        //ab  vLfelCti-h_pxJe19tNOj    oAjJeMsB-Ww-G3cD4  ManaBottle 750
        //ti   vLfelCti-h_pxJe19tNOj    oAjJeMsB-Ww-G3cD4
        //use   vLfelCti-h_pxJe19tNOj oAjJeMsB-Ww-G3cD4   vLfelCti-h_pxJe19tNOj
        //ls  cfpjMvZclvIW58KyV     rWc5pPRe AttackSpell  6  98
        //ls   vLfelCti-h_pxJe19tNOj   mrNeadEQtGNyy8b   AttackSpell     10  50
        //use   vLfelCti-h_pxJe19tNOj     mrNeadEQtGNyy8b     kkrAw9eM
        //ae  8fgmjnrEaD5VSrSGgZ    Gr-z5MFEZsEZtI Sword 131
        //ti   8fgmjnrEaD5VSrSGgZ    Gr-z5MFEZsEZtI
        //ae 8fgmjnrEaD5VSrSGgZ     Hnf7Ua26iscPMqsV-ZJ     Sword    120
        //ti     8fgmjnrEaD5VSrSGgZ   Hnf7Ua26iscPMqsV-ZJ
        //ls  64Vr5    c7mjOjpnRXurU7  HealSpell  2 175
        //ab cfpjMvZclvIW58KyV  uXC    DefBottle   50
        //ti  cfpjMvZclvIW58KyV uXC
        //use    cfpjMvZclvIW58KyV uXC 8fgmjnrEaD5VSrSGgZ
        //ae     hFQ75F27_LHYfVzyoXx  zxq  Sword  220
        //ti   hFQ75F27_LHYfVzyoXx     zxq
        //fight     hFQ75F27_LHYfVzyoXx   3    JU_  cfpjMvZclvIW58KyV  8fgmjnrEaD5VSrSGgZ
        //ae   vLfelCti-h_pxJe19tNOj yZ0UtIfp   Magicbook    284
        //ti   vLfelCti-h_pxJe19tNOj  yZ0UtIfp
        //fight     vLfelCti-h_pxJe19tNOj 3    kkrAw9eM  8fgmjnrEaD5VSrSGgZ cfpjMvZclvIW58KyV
        //ls cfpjMvZclvIW58KyV    Wsmg     AttackSpell 13     300
        //ae JU_ fw8_c01mimROYmwEPZQntgQr     Sword    342
        //ti JU_    fw8_c01mimROYmwEPZQntgQr
        //fight JU_  3   hFQ75F27_LHYfVzyoXx     8fgmjnrEaD5VSrSGgZ    cfpjMvZclvIW58KyV
        //ae    8fgmjnrEaD5VSrSGgZ     o2in0cc_HzPUT4pjoUd8     Armour   100
        //ab hFQ75F27_LHYfVzyoXx   xXv    HpBottle     1000
        //ti hFQ75F27_LHYfVzyoXx  xXv
        //use hFQ75F27_LHYfVzyoXx   xXv     8fgmjnrEaD5VSrSGgZ
        //ae 8fgmjnrEaD5VSrSGgZ    1YRzknTLTl1XPjO  Armour     100
        //ab vLfelCti-h_pxJe19tNOj   iXyEqwfo9yUW1kL   HpBottle 1000
        //ti  vLfelCti-h_pxJe19tNOj    iXyEqwfo9yUW1kL
        //use  vLfelCti-h_pxJe19tNOj   iXyEqwfo9yUW1kL  8fgmjnrEaD5VSrSGgZ
        //ae    JU_ AyU-yUN6McjuKaSl0dnzZF5C     Sword 221
        //ti    JU_     AyU-yUN6McjuKaSl0dnzZF5C
        //fight     JU_   1   kkrAw9eM
        //bi    hFQ75F27_LHYfVzyoXx  ZI3VpRFjofTWPe4fp   HpBottle
        //ae  8fgmjnrEaD5VSrSGgZ    jxJmSE3     Armour     100
        //ab   hFQ75F27_LHYfVzyoXx     CJFAckE0t2nsDMNWw1NZo     HpBottle     1000
        //ti     hFQ75F27_LHYfVzyoXx     CJFAckE0t2nsDMNWw1NZo
        //use    hFQ75F27_LHYfVzyoXx   CJFAckE0t2nsDMNWw1NZo 8fgmjnrEaD5VSrSGgZ
        //ae   kkrAw9eM     p_S  Sword    144
        //ti  kkrAw9eM  p_S
        //ae kkrAw9eM     2TaCoRoMsPzE8oPfY5qIHrR0   Sword   104
        //ti kkrAw9eM  2TaCoRoMsPzE8oPfY5qIHrR0
        //ri   vLfelCti-h_pxJe19tNOj     B-8ktJDFvuKEAIeRNLvRRDEn
        //ae     cfpjMvZclvIW58KyV   LhpU8B7  Armour     100
        //ab  hFQ75F27_LHYfVzyoXx  IhKVnD_zkI7iWwwopHk     HpBottle    1000
        //ti hFQ75F27_LHYfVzyoXx    IhKVnD_zkI7iWwwopHk
        //use    hFQ75F27_LHYfVzyoXx IhKVnD_zkI7iWwwopHk  cfpjMvZclvIW58KyV
        //ae JU_ eNwSLiyw5     Magicbook   337
        //ti  JU_     eNwSLiyw5
        //fight   JU_   3 hFQ75F27_LHYfVzyoXx  vLfelCti-h_pxJe19tNOj     64Vr5
        //bi     64Vr5  1l-hh6     DefBottle
        //ae    8fgmjnrEaD5VSrSGgZ    8dlIVlAwa3   Armour     100
        //ab   vLfelCti-h_pxJe19tNOj Fia7jLd5  HpBottle  1000
        //ti   vLfelCti-h_pxJe19tNOj  Fia7jLd5
        //use   vLfelCti-h_pxJe19tNOj  Fia7jLd5     8fgmjnrEaD5VSrSGgZ
        //ae JU_    ShcOYVzwxkDD     Sword   279
        //ti JU_ ShcOYVzwxkDD
        //fight   JU_  1 vLfelCti-h_pxJe19tNOj
        //bi     vLfelCti-h_pxJe19tNOj  CFZ9-o   AtkBottle
        //ae     cfpjMvZclvIW58KyV  zn2xgrUq Armour     100
        //ab     vLfelCti-h_pxJe19tNOj     8YemFLYDM    HpBottle     1000
        //ti    vLfelCti-h_pxJe19tNOj  8YemFLYDM
        //use  vLfelCti-h_pxJe19tNOj  8YemFLYDM cfpjMvZclvIW58KyV
        //ae   kkrAw9eM    JKafmTxmenwKq3BAO     Sword   219
        //ti kkrAw9eM  JKafmTxmenwKq3BAO
        //fight kkrAw9eM 2   64Vr5   hFQ75F27_LHYfVzyoXx
        //ri   JU_     fw8_c01mimROYmwEPZQntgQr
        //ae    cfpjMvZclvIW58KyV   oaIDx47Tq5ICJdNmmC8f     Armour   100
        //ab   JU_     grhjwvCHrUpqQcBfa4oZ1e5a   HpBottle  1000
        //ti   JU_ grhjwvCHrUpqQcBfa4oZ1e5a
        //use   JU_    grhjwvCHrUpqQcBfa4oZ1e5a     cfpjMvZclvIW58KyV
        //ae     vLfelCti-h_pxJe19tNOj     JVmZhfgZHdzeyZC     Magicbook   126
        //ti   vLfelCti-h_pxJe19tNOj    JVmZhfgZHdzeyZC
        //fight     vLfelCti-h_pxJe19tNOj  1     64Vr5
        //use     64Vr5  1l-hh6  vLfelCti-h_pxJe19tNOj
        //ae     cfpjMvZclvIW58KyV     yTZLobG-Qx5T  Armour 100
        //ab     vLfelCti-h_pxJe19tNOj DOGCDCjwv-jo-v   HpBottle  1000
        //ti vLfelCti-h_pxJe19tNOj    DOGCDCjwv-jo-v
        //use   vLfelCti-h_pxJe19tNOj     DOGCDCjwv-jo-v    cfpjMvZclvIW58KyV
        //ae  vLfelCti-h_pxJe19tNOj L5onshcknzNqp5_Gl7Ee Sword  149
        //ti   vLfelCti-h_pxJe19tNOj    L5onshcknzNqp5_Gl7Ee
        //ae vLfelCti-h_pxJe19tNOj     PpQJomO Sword 284
        //ti     vLfelCti-h_pxJe19tNOj PpQJomO
        //ls   64Vr5    LlQFnzg-  HealSpell 17    204
        //use  64Vr5   LlQFnzg-     kkrAw9eM
        //ab   JU_   DZ6FGc7Ws    AtkBottle  227
        //ti JU_    DZ6FGc7Ws
        //use JU_ DZ6FGc7Ws JU_
        //ls    64Vr5    MMHCWjycfA9_X4Z9NG_SwqW HealSpell 4  68
        //ae 8fgmjnrEaD5VSrSGgZ  cbxbdHNIzcH3PY-Y  Armour    100
        //ab 64Vr5 qDNOlC_XWjRXa4s  HpBottle    1000
        //ti   64Vr5   qDNOlC_XWjRXa4s
        //use 64Vr5   qDNOlC_XWjRXa4s 8fgmjnrEaD5VSrSGgZ
        //ae  JU_   BQ47VJW3BUrIuZv3MYxWP18E   Sword     342
        //ti    JU_   BQ47VJW3BUrIuZv3MYxWP18E
        //fight JU_  3  64Vr5   kkrAw9eM    vLfelCti-h_pxJe19tNOj
        //ae   hFQ75F27_LHYfVzyoXx    0bBYTB_Ckc2hoaaIJ   Armour   100
        //ab JU_  sPP_nxzrvTxov HpBottle  1000
        //ti  JU_  sPP_nxzrvTxov
        //use   JU_     sPP_nxzrvTxov   hFQ75F27_LHYfVzyoXx
        //bi JU_   D_DmMTErMmg     HpBottle
        //ab   JU_   dXUyRAnoPhI9ou     AtkBottle   687
        //ti    JU_   dXUyRAnoPhI9ou
        //use  JU_ dXUyRAnoPhI9ou    JU_
        //use     JU_   D_DmMTErMmg JU_
        //bi    JU_    NQlF46p0qJgROCbNX Magicbook
        //bi  JU_    I9XyHdmOS1RRIJgBi5   DefBottle
        //ls    JU_ qvD93Xmu7aqoNUmC1    AttackSpell   10    50
        //use   JU_   qvD93Xmu7aqoNUmC1   kkrAw9eM
        //ab JU_   9N75T-ZL9wrViJ  AtkBottle     709
        //ti     JU_   9N75T-ZL9wrViJ
        //use     JU_   9N75T-ZL9wrViJ  JU_
        //ri   JU_  NQlF46p0qJgROCbNX
        //ri     JU_    ShcOYVzwxkDD
        //ab  JU_  OjmL_Nk  ManaBottle  509
        //ti     JU_   OjmL_Nk
        //use   JU_     OjmL_Nk JU_
        //ls     JU_    2ROq0EyHZP_j-RPrO54    AttackSpell 5   253
        //ae    cfpjMvZclvIW58KyV    LvfTfYSr  Armour     100
        //ab  JU_ EY4V0fhXXFi1emay     HpBottle     1000
        //ti  JU_ EY4V0fhXXFi1emay
        //use    JU_   EY4V0fhXXFi1emay cfpjMvZclvIW58KyV
        //ae   JU_   H8K9zCl    Sword    140
        //ti    JU_   H8K9zCl
        //ae     JU_  Z8kePsv1q9CUe15BckqXwN   Sword     244
        //ti   JU_    Z8kePsv1q9CUe15BckqXwN
        //ae   hFQ75F27_LHYfVzyoXx   8lOVk8  Armour   100
        //ab JU_   G13jn HpBottle 1000
        //ti  JU_  G13jn
        //use    JU_ G13jn hFQ75F27_LHYfVzyoXx
        //ae hFQ75F27_LHYfVzyoXx   1j3FPYK6-StBVQHa-7JpFMa   Armour 100
        //ab   JU_  lXsOou  HpBottle   1000
        //ti  JU_    lXsOou
        //use     JU_     lXsOou hFQ75F27_LHYfVzyoXx
        //ab   JU_  Cm1 ManaBottle 291
        //ti     JU_ Cm1
        //use JU_    Cm1     JU_
        //ri  JU_  AyU-yUN6McjuKaSl0dnzZF5C
        //bi    JU_    sLLs  Armour
        //ab     JU_   KADUigup71VMDj   HpBottle  501
        //ti     JU_    KADUigup71VMDj
        //use JU_ KADUigup71VMDj  JU_
        //ae   kkrAw9eM uyibBr86Y95    Armour  100
        //ab     JU_   sTScl18E0oA0ZyFsg   HpBottle   1000
        //ti JU_  sTScl18E0oA0ZyFsg
        //use   JU_     sTScl18E0oA0ZyFsg    kkrAw9eM
        //ae  8fgmjnrEaD5VSrSGgZ  nLwVlfYrYSk-l8J0eW_   Armour    100
        //ab    JU_   4G9Tyk3cGhVISkiFQT0Ggb     HpBottle     1000
        //ti JU_     4G9Tyk3cGhVISkiFQT0Ggb
        //use     JU_  4G9Tyk3cGhVISkiFQT0Ggb   8fgmjnrEaD5VSrSGgZ
        //bi   JU_   -XCp1nVElKi Sword
        //ae    JU_  PYlE7yyZKw57VxiAUbyionl     Sword 120
        //ti   JU_ PYlE7yyZKw57VxiAUbyionl
        //ae  JU_ v5pZ6Z9wRLvnVZ37   Sword     301
        //ti   JU_  v5pZ6Z9wRLvnVZ37
        //bi   JU_     GlLBs0LgDFc9fKOptN Magicbook
        //bi     JU_     bkxa6BOn3feQhOmZ   DefBottle
        //ae     JU_     mREHxq Sword 92
        //ti JU_ mREHxq
        //ae   JU_    Wcy4gOf Sword     331
        //ti   JU_   Wcy4gOf
        //use   JU_   2ROq0EyHZP_j-RPrO54     kkrAw9eM
        //ls   JU_ N83uWKeHxnbJ8gcn  HealSpell 29 108
        //ae   JU_     Yoo1LiqW   Sword 136
        //ti    JU_ Yoo1LiqW
        //ae   JU_     RmFL    Sword  328
        //ti    JU_     RmFL
        //use    JU_    D_DmMTErMmg  JU_
        //ae    vLfelCti-h_pxJe19tNOj   5SuzSjQ2   Armour   100
        //ab JU_    BZOuoaPHB-dpeEMKcG HpBottle     1000
        //ti JU_    BZOuoaPHB-dpeEMKcG
        //use     JU_ BZOuoaPHB-dpeEMKcG    vLfelCti-h_pxJe19tNOj
        //ae JU_   e4p5    Sword  119
        //ti   JU_   e4p5
        //ae  JU_     yMaGn8zu4   Sword     220
        //ti     JU_    yMaGn8zu4
        //bi     JU_ XwW  Armour
        //ri   JU_     XwW
        //ab   JU_    Ia62x8    AtkBottle     312
        //ti    JU_  Ia62x8
        //use JU_  Ia62x8   JU_
        //ae   cfpjMvZclvIW58KyV     b_6uooBrOPDIV24 Armour 100
        //ab   JU_    FTKp4GPcG2bAnDIpvrdnkqCX  HpBottle     1000
        //ti    JU_ FTKp4GPcG2bAnDIpvrdnkqCX
        //use   JU_ FTKp4GPcG2bAnDIpvrdnkqCX     cfpjMvZclvIW58KyV
        //bi JU_     Qv5zvKrU-Jmt80S  ManaBottle
        //ls JU_     pV_7UsmoAkktHs0qUXqMDqc  HealSpell  26     248
        //ae    hFQ75F27_LHYfVzyoXx     asiuiQ1SB  Armour    100
        //ab     JU_ A3AUzWu  HpBottle  1000
        //ti  JU_  A3AUzWu
        //use   JU_     A3AUzWu    hFQ75F27_LHYfVzyoXx
        //ae   JU_     4r7enPO7B   Sword   90
        //ti   JU_ 4r7enPO7B
        //ae     JU_ uuFwtoszIf5mJLV Sword   170
        //ti  JU_    uuFwtoszIf5mJLV
        //bi    JU_  E6hH     DefBottle
        //ls    JU_   kX3R     AttackSpell 1 116
        //ab     JU_     3S_Nl7NA2lA  AtkBottle    183
        //ti    JU_   3S_Nl7NA2lA
        //use     JU_    3S_Nl7NA2lA     JU_
        //use    JU_ Qv5zvKrU-Jmt80S  JU_
        //ri JU_     FTKp4GPcG2bAnDIpvrdnkqCX
        //ae    JU_   eJnbxan   Sword    128
        //ti    JU_     eJnbxan
        //ae    JU_     sgiIXMajUL3p8     Sword    152
        //ti    JU_     sgiIXMajUL3p8
        //bi    JU_ b3wr0E8oufNFGb1iu_O  ManaBottle
        //ae    vLfelCti-h_pxJe19tNOj LYlEWTRR Armour     100
        //ab   JU_    MVAuXrdvX_VZPiMfeom    HpBottle     1000
        //ti  JU_ MVAuXrdvX_VZPiMfeom
        //use    JU_  MVAuXrdvX_VZPiMfeom   vLfelCti-h_pxJe19tNOj
        //ab JU_    SqSCn8elBw-Px14R8611pw65   ManaBottle     252
        //ti     JU_    SqSCn8elBw-Px14R8611pw65
        //use   JU_   SqSCn8elBw-Px14R8611pw65    JU_
        //use     JU_    qvD93Xmu7aqoNUmC1    vLfelCti-h_pxJe19tNOj
        //use     JU_ N83uWKeHxnbJ8gcn    hFQ75F27_LHYfVzyoXx
        //ab JU_    vnuE     AtkBottle 451
        //ti JU_    vnuE
        //use    JU_     vnuE    JU_
        //ls  JU_  rmSHR8By3am_HfMYl3vwB AttackSpell 24  272
        //ae     vLfelCti-h_pxJe19tNOj     puhAca0ia29    Armour  100
        //ab    JU_ p8W9Tu   HpBottle    1000
        //ti   JU_ p8W9Tu
        //use     JU_  p8W9Tu     vLfelCti-h_pxJe19tNOj
        //use    JU_    N83uWKeHxnbJ8gcn    cfpjMvZclvIW58KyV
        //ae  JU_     Twnkpk    Sword   61
        //ti JU_ Twnkpk
        //ae     JU_ U4HV4XeBQHplKgq6ZB0W2DH     Sword   255
        //ti  JU_   U4HV4XeBQHplKgq6ZB0W2DH
        //ae   kkrAw9eM    Q0sML5kh0xzEB     Armour     100
        //ab     JU_ ig6IeNPQ3ROdO4_lcNdUx   HpBottle  1000
        //ti     JU_     ig6IeNPQ3ROdO4_lcNdUx
        //use    JU_    ig6IeNPQ3ROdO4_lcNdUx   kkrAw9eM
        //ae    hFQ75F27_LHYfVzyoXx     M78XxFNpcg7R-fTFUi     Armour     100
        //ab  JU_   hF2z9gM0Eztj8     HpBottle 1000
        //ti JU_  hF2z9gM0Eztj8
        //use     JU_   hF2z9gM0Eztj8   hFQ75F27_LHYfVzyoXx
        //ab    JU_     xgcedp3Je6WjdjMzirr   DefBottle 509
        //ti    JU_    xgcedp3Je6WjdjMzirr
        //use    JU_ xgcedp3Je6WjdjMzirr  JU_
        //ae    kkrAw9eM   LkfMCr0Gcvl   Armour   100
        //ab    JU_ s3c4rYzoN6y3z   HpBottle     1000
        //ti   JU_   s3c4rYzoN6y3z
        //use   JU_     s3c4rYzoN6y3z kkrAw9eM
        //ae     vLfelCti-h_pxJe19tNOj lfD7cUPN35saCGLEwoE1bL     Armour  100
        //ab    JU_  Uu-L8QaFYbvJ0_I45t     HpBottle     1000
        //ti JU_ Uu-L8QaFYbvJ0_I45t
        //use    JU_    Uu-L8QaFYbvJ0_I45t   vLfelCti-h_pxJe19tNOj
        //ae hFQ75F27_LHYfVzyoXx    SqTlAbu9xEr Armour  100
        //ab  JU_    -uHPc    HpBottle  1000
        //ti  JU_    -uHPc
        //use  JU_     -uHPc   hFQ75F27_LHYfVzyoXx
        //ae     JU_     hYV     Sword    101
        //ti   JU_  hYV
        //ae  JU_  vzWMS9CT7cuC2dhnIj Sword 166
        //ti JU_     vzWMS9CT7cuC2dhnIj
        //ae   8fgmjnrEaD5VSrSGgZ  0g2808uUpvrwYwR5hXfPS   Armour    100
        //ab    JU_   Kaqa5TxM1xMBN    HpBottle 1000
        //ti JU_  Kaqa5TxM1xMBN
        //use JU_   Kaqa5TxM1xMBN   8fgmjnrEaD5VSrSGgZ
        //use  JU_   rmSHR8By3am_HfMYl3vwB     64Vr5
        //ae     cfpjMvZclvIW58KyV  dqbe1xqcbAhw  Armour  100
        //ab   JU_ AJ42PU6VF_yOgQ1    HpBottle    1000
        //ti    JU_    AJ42PU6VF_yOgQ1

    }

    @Test
    public void addEquipment() {
    }

    @Test
    public void learnSpell() {
    }

    @Test
    public void removeItem() {
    }

    @Test
    public void takeItem() {
    }

    @Test
    public void use() {
    }

    @Test
    public void buyItem() {
    }

    @Test
    public void fight() {
    }
}
