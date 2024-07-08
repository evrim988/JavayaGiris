package org.donguler._02For;

import java.util.Scanner;

public class Ornek06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kare boyutu giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //çözüm 2
        String kenar = "";
        for (int i = 0; i < sayi; i++) {
            kenar += "*"; //kenar="***"
        }
        for (int i = 0; i < sayi; i++) {
            System.out.println(kenar);
        }
    }


}
