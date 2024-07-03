package org.KararYapilari;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        String harfNot = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        int not = scanner.nextInt();

        if(not > 100) {
            System.out.println("Not 1100'den büyük olamaz.");
        }
        else if(not >= 90){
            harfNot = "AA";
        } else if (not >= 80) {
            harfNot = "BA";
        } else if (not >= 70) {
            harfNot = "BB";
        } else if (not >= 60) {
            harfNot = "CB";
        } else if (not >= 50) {
            harfNot = "CC";
        } else if (not >= 40) {
            harfNot = "DC";
        }
        else if(not >= 30){
            harfNot = "DD";
        }
        else if(not >= 0) {
            harfNot = "FF";
        }
        else {
            System.out.println("Gireceğiniz not 0-100 arasında olmalıdır.");

        }
        System.out.println("notunuz: " + harfNot);
    }
}
