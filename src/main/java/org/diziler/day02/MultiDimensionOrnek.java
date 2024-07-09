package org.diziler.day02;

public class MultiDimensionOrnek {
    public static void main(String[] args) {

        /*
       Sno     No         Ad       Not
       1       101        Ece      100
       2       102        Su       80
       3       103        Ali      70
       4       104        Can      40
    Bu yapı çok boyutlu dizide tutulabilir mi?
       */

        String[][] sinifListesi =
                {
                        {"1", "101", "Ece", "100"},
                        {"2", "102", "Su", "80"},
                        {"3", "103", "Ali", "70"},
                        {"4", "104", "Can",	"40"}
                };

        String[][] sinifListesi2=new String[4][4];
        sinifListesi2[0][0]="1";
        sinifListesi2[0][1]="101";
        sinifListesi2[0][2]="Ece";
        sinifListesi2[0][3]="100";

        sinifListesi2[1][0]="2";
        sinifListesi2[1][1]="102";
        sinifListesi2[1][2]="Su";
        sinifListesi2[1][3]="80";

        for (int i = 0; i < sinifListesi2.length; i++) {

        }
    }
}
