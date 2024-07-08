package org.donguler._01While;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {
//1 den 100 e kadar olan sayıların toplamını while döngüsü ile yazalım.
       int sayi = 1;
       int toplam = 0;

       while (sayi <= 100){
           toplam += sayi;
           sayi++;
       }
        System.out.println(toplam);

    }
}
