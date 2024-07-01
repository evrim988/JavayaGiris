package org.example;

public class Sabitler {
    public static void main(String[] args) {
        int i = 5;
        i=10;
        System.out.println(i);

        //sabit tanımı
        final  int a=20;
        System.out.println(a);

        //a=10; //değişkenin değerini değiştirmek istediğimde buna izin vermiyor.
        // Çünkü bunu final keywordu ile sabit bir değişken olarak tanımladık.

        int c;
        c=20;
        c=40; //burdaki sabiti değiştirebiliyorum çünkü sabit değişken yapmadık.
        System.out.println(c);
        System.out.println(Math.PI); //math sınıfındaki PI sabit değişkenin çağırımı.(büyük harfle yazılmış!)

        float r=3F;
        final double DAIRE_CEVRE = (2* Math.PI * r);
        final String MARKA = "Bilge Adam";
    }
}
