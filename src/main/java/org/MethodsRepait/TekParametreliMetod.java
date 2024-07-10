package org.MethodsRepait;

public class TekParametreliMetod {
    public static void main(String[] args) {

        int karesi = kare(3);
        System.out.println("3 sayısının karesi: " + karesi);
        //3 sayısının karesi: 9 çıktısını verir.

        System.out.println("10 sayısının 10 katı: " + onKati(10));
        //10 sayısının 10 katı: 100 gibi bir çıktı verir.

        baslikYazdir("Merhaba");
        //*************************************
        //***********Merhaba****************
        //*************************************
        //çıktısını vermiş oldu.
    }

    public static int kare(int sayi){
        return sayi * sayi;
    }

    public static int onKati(int sayi){
        return sayi * 10;
    }

    public static void baslikYazdir(String baslik){
        System.out.println("*************************************");
        System.out.println("***********"+baslik+"****************");
        System.out.println("*************************************");
    }
}
