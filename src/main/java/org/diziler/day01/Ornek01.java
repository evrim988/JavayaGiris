package org.diziler.day01;

import java.util.Random;

public class Ornek01 {
    public static void main(String[] args) {

        //rastgele int değerlerden oluşan(0-100) 10 elemanlı bir dizi oluşturup, ekrana değerleri yazdıralım.

        //10 elemanlı dizi tanımlayalım.
        int[] randomNumber = new int[11];
        Random rnd = new Random();

        randomNumber[0] = rnd.nextInt(0,101);
        randomNumber[1] = rnd.nextInt(0,101);
        randomNumber[2] = rnd.nextInt(0,101);
        randomNumber[3] = rnd.nextInt(0,101);

        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = rnd.nextInt(0,101); //rastgele değerleri dizideki gözlere atadık.
        }

        for(int item: randomNumber){
            System.out.println(item);
        }
    }
}
