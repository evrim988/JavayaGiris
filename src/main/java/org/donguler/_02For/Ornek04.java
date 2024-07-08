package org.donguler._02For;

public class Ornek04 {
    public static void main(String[] args) {
//1-50 kadar olan sayıların 3ün katı olanları ekraba yazdırın.
        for (int i = 1; i <= 50; i++) {
            if(i % 3 == 0) //3 e bölümünden kalan sayılar 3 ün katıdır.
                System.out.println(i);
        }

        //2.yöntem
        for (int i = 3; i <=50 ; i+=3) {
            System.out.println(i);
        }

    }
}
