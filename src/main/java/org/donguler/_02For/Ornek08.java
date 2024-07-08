package org.donguler._02For;

import java.util.Scanner;

public class Ornek08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin boyutunu giriniz: ");
        int boyut = scanner.nextInt();
        String karakter = "*";

        for (int i = boyut; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(karakter);
            }
            System.out.println();
        }

    }
}
