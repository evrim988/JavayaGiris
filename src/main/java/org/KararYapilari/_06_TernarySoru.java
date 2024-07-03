package org.KararYapilari;

import java.util.Scanner;

public class _06_TernarySoru {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuz giriniz: ");
        int not = scanner.nextInt();

        String metin = (not >= 50) ? "Kaldı" : "Geçer";
    }
}
