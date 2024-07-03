package org.KararYapilari;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz: ");
        float fiyat = scanner.nextFloat();


        if(fiyat>=1000){
            System.out.println("İndirimli Fiyat: " + fiyat * 0.8);
        }
        else if (fiyat >= 500) {
            System.out.println("İndirimli Fiyat: " + fiyat * 0.9 );
        }
        else if(fiyat >= 100){
            System.out.println("İndirimli Fiyat: " + fiyat * 0.95);
        }
    }
}
