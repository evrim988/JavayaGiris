package org.diziler.DiziTekrar;

public class Soru05 {
    public static void main(String[] args) {

        /*Günlerin yazılı olduğu bir dizi tanımlayalım ve bunun ka. satır oldupunu bulalım.*/

        String[] days = {"Pazar","Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi"};

        for (int i = 0; i < days.length-1; i++) {
            System.out.println(i+ " .satır: " + days[i]);
        }
       /* 0 .satır: Pazar
        1 .satır: Pazartesi
        2 .satır: Salı
        3 .satır: Çarşamba
        4 .satır: Perşembe
        5 .satır: Cuma
        6 .satır: Cumartesi
        toplam 7 satır olarak çıktı verir.*/


    }
}
