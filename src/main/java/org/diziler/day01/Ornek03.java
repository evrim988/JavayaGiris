package org.diziler.day01;

import java.util.Scanner;

public class Ornek03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] dizi = new int[5];

        System.out.println("Dizi elemanlarını giriniz. ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1) + " .sayıyı giriniz: ");
            dizi[i] = input.nextInt();
        }

        System.out.print("Dizide aranacak değeri giriniz: ");
        int aranan = input.nextInt();

        boolean bulunduMu = false;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i] == aranan) {
                bulunduMu = true;
            }
        }
        System.out.println((bulunduMu) ? "Bulundu" : "Bulunamadı");
    }
}
