package org.diziler.day01;

import java.util.Scanner;

public class Ornek02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olsun: ");
        int[] dizi = new int[scanner.nextInt()];

        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1) + " . sayıyı giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        int max = dizi[0];
        int min = dizi[0];

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i] > max){
                max = dizi[i];
                maxIndex = i;
            }
            if(dizi[i]<min){
                min = dizi[i];
                minIndex = i;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
