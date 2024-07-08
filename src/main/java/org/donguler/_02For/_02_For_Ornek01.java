package org.donguler._02For;

import java.util.Scanner;

public class _02_For_Ornek01 {
    //1-n e kadar olan sayıların toplamını for döngüsü ile yazdırın.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;//başlangıçda etkisi olmaması için 0 olarak tanımladık.

        for (int i = 1; i <= sayi; i++) {
            toplam += i;
        }
        System.out.println("1'den n'e kadar olan sayıların toplamı: " + toplam);
    }
}
