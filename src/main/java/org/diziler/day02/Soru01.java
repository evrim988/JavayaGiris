package org.diziler.day02;

import java.util.Arrays;

public class Soru01 {
    public static void main(String[] args) {

        int[] dizi1 = {20,19,20,40,3,40,5,3,7,3};
        int[] dizi2;
        int dizi2Uzunluk = dizi1.length;

        for (int i = 0; i < dizi1.length; i++) {
            for (int j = i+1; j < dizi1.length; j++) {
                if(dizi1[i] == dizi1[j]){
                    dizi2Uzunluk--;
                    break;
                }
            }
        }
        System.out.println("Dizi2 uzunluk: " + dizi2Uzunluk);
        dizi2 = new int[dizi2Uzunluk];

        boolean esitMi = false;
        int dizi2Index=0;
        for (int i = 0; i < dizi1.length; i++) {
            esitMi = false;
            for (int j = i+1; j < dizi1.length; j++) {
                if(dizi1[i] == dizi1[j]) { //tekrar eden değer bulunursa;
                    System.out.println("dizi1[i]: " + dizi1[i]);
                    esitMi = true;
                    break;
                }
            }
            if(!esitMi){
                dizi2[dizi2Index] = dizi1[i];
                dizi2Index++;
            }
        }
        System.out.println(Arrays.toString(dizi2));
    }
}
