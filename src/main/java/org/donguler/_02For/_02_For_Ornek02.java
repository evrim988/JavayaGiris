package org.donguler._02For;

public class _02_For_Ornek02 {
    public static void main(String[] args) {
        //1 den 10 a kadar olan sayıların faktöriyelini hesaplayalım.
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact *= i;
            System.out.println(i + "! -> " + fact);
        }
    }
}
