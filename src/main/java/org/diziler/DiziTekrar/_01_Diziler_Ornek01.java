package org.diziler.DiziTekrar;

import java.util.Random;

public class _01_Diziler_Ornek01 {
    public static void main(String[] args) {

        /* rastgele int değerlerden(0-100 arası) oluşan 10 elemanlı bir dizi oluşturup, ekrana değerleri yazdıralım.*/

        int[] rastgeleSayilar = new int[10];

        Random random = new Random();

        for (int i = 0; i < rastgeleSayilar.length; i++) {
            rastgeleSayilar[i] = random.nextInt(0,101);
            //tanımladığımız random sınıfından tanımladığımız diziye değerleri atamış olduk.
        }

        for (int item: rastgeleSayilar){
            System.out.println(item);
        }
        /*51
          96
          70
          60
          12
          90
          95
          14
          56
          61
        */

        for (int i = 0; i < rastgeleSayilar.length; i++) {
            System.out.println(i + " indexteki eleman: " + rastgeleSayilar[i]);
        }
        /*0 indexteki eleman: 76
        1 indexteki eleman: 86
        2 indexteki eleman: 61
        3 indexteki eleman: 58
        4 indexteki eleman: 54
        5 indexteki eleman: 2
        6 indexteki eleman: 75
        7 indexteki eleman: 76
        8 indexteki eleman: 60
        9 indexteki eleman: 22*/

    }
}
