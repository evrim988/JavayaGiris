package org.donguler._02For;

public class Ornek03 {
    public static void main(String[] args) {
//1-100'e kadar olan sayılardan sadece tek sayıların toplamını
        int toplam = 0;
        for (int i = 1; i <= 100; i+=2) { //1 den başlattığımız için tek sayıları ekrana yazdırır.

            System.out.println(i);
            toplam += i;

        }
        System.out.println(toplam);
    }
}
