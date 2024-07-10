package org.MethodsRepait;

import java.util.Arrays;

public class MethodTanimlari2 {
    public static void main(String[] args) {

        MethodTanimlari2 object = new MethodTanimlari2();
        object.selam(); //ekrana "selam" şeklinde çıktı vermiş oldu.

        System.out.println("Metot ile toplama işleminin sonucu: " + topla(5, 3));
        //"Metot ile toplama işleminin sonucu: 8" şeklinde çıktı vermiş oldu.
        //geriye bir değer döndüğü için ekrana çıktı vererek burda saklamış olduk.

        toplam(5,3);//void metot parametreli çağırımı(2 metot birbirine bağlı)

        System.out.println("En büyük sayı: " + max(5, 8));

        System.out.println(Arrays.toString(sayilar()));



    }

    //non-static metod
    //geriye değer döndürmeyen parametresiz metod.
    public void selam(){
        System.out.println("selam");
    }

    //geriye değer döndüren parametreli metot
    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public static void toplam(int sayi1, int sayi2){
        System.out.println("toplam metodu çağırıldı");
        System.out.println(topla(sayi1,sayi2));
        //buraya geldi "toplam metodu çağırıldı" dedi
        // ve topla metoduna gidip iki sayıyı toplayıp bunu ekrana çıktı olarak vermiş oldu.
    }

    public static int max(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }

    //birden çok değer dönüş yapılacaksa; Ancak bu metotlarda sadece 1 tane dizi dönüş yapılır, 2 tane dönüş olmaz.
    public static int[] sayilar(){
        int[] notDizisi = {5,8,4,10,15};
        return notDizisi;
    }

}
