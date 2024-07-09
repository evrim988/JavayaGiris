package org.diziler.DiziTekrar;

import java.util.Arrays;

public class Soru04 {
    public static void main(String[] args) {

        isimYaz("Evrim","Veli");
         isimYaz(new String[]{"Ece", "aslı"});
        isimleriYaz(new String[]{"Ali","Veli"});
        //isimleriYaz("Murat");
        //böyle dediğimde hata veriyor. Çünkü bizden bir string[] dizisi bekliyor.
    }

    public static void isimYaz(String... isimler){
        System.out.println(Arrays.toString(isimler));
    }

    public static void isimleriYaz(String[] isimler){
        System.out.println(Arrays.toString(isimler));
    }
}
