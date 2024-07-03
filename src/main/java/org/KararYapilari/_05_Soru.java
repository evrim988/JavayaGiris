package org.KararYapilari;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lüten bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if(sayi < 0){
            System.out.println(sayi + " sayısı negatiftir.");
        } else if (sayi > 0) {
            System.out.println(sayi + " sayısı pozitiftir.");
        }
        else {
            System.out.println("girilen sayı nötr'dür.");
        }
    }
}
