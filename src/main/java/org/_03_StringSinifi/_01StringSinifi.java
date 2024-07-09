package org._03_StringSinifi;

public class _01StringSinifi {
    public static void main(String[] args) {
        //String sınıfından constructur nesne oluşturma
        String ad = new String("Evrim");
        //String i çağırdığımızda çalışan metod.

        // " " ile String nesnesi oluşturma
        String soyad = "Çalışkan";
        //bu yöntemle String'i kullanmak daha doğru. Genelde bu yöntem kullanılır.
        //String sınıfı final keywordü içersen bir sınıftır. Final keyword u içeren bir sınıftan miras alınamaz.

        //Mutable - Immutable
        // String sınıfı immutable bir sınıftır. Değiştirelemez demektir.
        soyad += " R.";
    }


}
