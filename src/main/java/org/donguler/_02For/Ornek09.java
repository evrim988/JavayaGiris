package org.donguler._02For;

import java.util.Scanner;

public class Ornek09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        for (int i = 1; i <= boyut; i++) {
            for (int j = i; j < boyut; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
