package org.donguler._02For;

import java.util.Scanner;

public class Ornek07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin boyutunu giriniz: ");
        int boyut = scanner.nextInt();
        String karakter = "";

        for (int i = 1; i <= boyut; i++) {
            karakter += "*";
            System.out.println(karakter);
        }

        System.out.println("------------------------------");
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
