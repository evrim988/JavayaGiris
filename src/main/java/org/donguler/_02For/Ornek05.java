package org.donguler._02For;

public class Ornek05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println(i + " 15 in katı");
            else if(i % 3 == 0)
                System.out.println(i + " 3 ün katı");
            else if(i % 5 == 0)
                System.out.println(i + " 5 in katı");
            else {
                System.out.println(i);
            }
        }

    }
}
