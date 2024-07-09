package org.diziler.DiziTekrar;

public class _02_varargs {
    public static void main(String[] args) {

        //varargs açılımı: variable arguments
        //bir metoda aynı tipte değişken sayısı kadar değer göndermek için kullanılır.
        //main method parametre olarak string[] args almaktadır.Yani bir string dizisini parametre olarak alabiliyor.
        //burada String[] args yerine String... args da kullanılabilir. Bu yönteme varargs denir.

        //metodu burada çağıralım.
        int topla = topla(5, 10);
        System.out.println(topla); //iki değeri topladı ve 15 değerini döndü.
    }

    //örnek bir metod yazalım;
    public static int topla(int... sayilar){
        int toplam = 0;
        for (int item: sayilar){
            toplam += item;
        }
        return toplam;
    }
}
