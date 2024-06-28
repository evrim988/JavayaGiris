package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner class ile kullanıcıdan veri alma kısmını yapmış olduk.
        Scanner scanner = new Scanner(System.in);

        int sayi1, sayi2, toplam;
        System.out.print("Lütfen bir sayı giriniz: ");
        sayi1=scanner.nextInt();

        System.out.print("lütfen ikinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        toplam = sayi1 + sayi2;
        System.out.println("Girilen iki sayının toplamı: " + toplam);

        System.out.println("commit");
    }
}