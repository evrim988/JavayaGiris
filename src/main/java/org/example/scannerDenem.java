package org.example;

import java.util.Scanner;

public class scannerDenem {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String name,surName;
        System.out.println("Lütfen adınızı giriniz: ");
        name = scanner.nextLine();
        System.out.println("Lütfen soyadınız giriniz: ");
        surName = scanner.nextLine();
        System.out.println("Merhaba " + name + " " + surName);
    }
}
