package org.KararYapilari;

public class _02_Soru {
    public static void main(String[] args) {

        String sehir = "İstanbul";
        int tutar = 0;

        if(sehir.equals("İstanbul")){
            tutar = 150;
        }
        else if(sehir.equals("Ankara")){
            tutar = 200;
        }
        else {
            System.out.println("geçerli bir şehir giriniz.");
        }
        System.out.println(sehir + " için fiyat: " + tutar);

    }
}
