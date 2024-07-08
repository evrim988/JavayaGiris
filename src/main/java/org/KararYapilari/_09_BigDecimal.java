package org.KararYapilari;

import java.math.BigDecimal;

public class _09_BigDecimal {
    public static void main(String[] args) {

        //bigdecimal sınıfı scanner sınıfı gibi new lenerek kullanılıyor./*
        // . ile bu sınıfın içeriğine erişmiş oluyoruz.*/

        BigDecimal sayi = new BigDecimal("0.1"); //newleyerek bu sınıfı çağırmış olduk.
        // Tırnak içinde yazmamız gerekiyor çünkü doğru sonucu o veriyor.
        BigDecimal sonucBigDecimal = sayi.add(sayi).add(sayi).add(sayi);
        //bu sınıf üzerinden oluşturduğum sayi değerine ekleme işlemi yaparak toplama işlemini yaptırmış olduk.
        System.out.println(sonucBigDecimal);
        //sonucu ekrana yazdırdık.

        BigDecimal sonucBigDecimal2 = sayi.multiply(sayi);
        System.out.println(sonucBigDecimal2);
    }
}
