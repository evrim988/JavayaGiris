package org.diziler.day02;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //Çok boyutlu diziler
        int[] sayilar = {5,6,7}; //tek boyutlu dizi
        int[][] koordinat = { //çok boyutlu diziler örnek tanım bu şekilde. 2 tane parantez koymam 2 boyutlu olduğunu gösteriyor.
                {1,2},
                {3,4},
                {5,6}
        }; //3 satır, 2 sütun
        int[][] koordinatlar2 = {
                {1,2,3},
                {4,5,6}
        };
        int[] sayilar2 = new int[10]; //10 elemanlı tek boyutlu dizi

        int[][] koordinatlar3 = new int[3][2];
    }
}
