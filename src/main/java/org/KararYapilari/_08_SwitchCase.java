package org.KararYapilari;

import java.util.Scanner;

public class _08_SwitchCase {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        int not = scanner.nextInt();
        String harfNot;

        if(not<0 || not>100){
            System.out.println("0-100 arasında not değeri giriniz!");
        }
        else {
            switch (not / 10) {
                case 10:
                case 9:
                    harfNot = "AA";
                    break;
                case 8:
                    harfNot = "AB";
                    break;
                case 7:
                    harfNot = "BB";
                    break;
                case 6:
                    harfNot = "BC";
                    break;
                case 5:
                    harfNot = "CC";
                    break;
                case 4:
                    harfNot = "DC";
                    break;
                case 3:
                    harfNot = "DD";
                    break;
                default:
                    harfNot = "FF";
                    break;
            }
        }
    }
}
