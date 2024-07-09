package org.diziler;

public class deneme {
    public static void main(String[] args) {

        int[] intDizi = new int[5];
        intDizi[0] = 10;
        intDizi[1] = 20;
        intDizi[2] = 30;
        intDizi[3] = 40;
        intDizi[4] = 50;
        //intDizi[5] = 60;  //ArrayIndexOutOfBoundsException hatası alırız. index numarası en fazla length-1 olabilir.
        //dizinin boyutunu verdiğimiz zaman mesela 5 diye tanımladım yukarıda. Bu sayı index sayısını gösteriyor.
        //index lerde 0 dan başlar.
        //0 1 2 3 4

        for (int item: intDizi){
            System.out.println(item);
        }
        //buraya foreach deniyor. Dizileri ekrana yazdırmak için böyle bir yöntem kullanıyoruz. c# da var item in intDizi gibi...


    }
}
