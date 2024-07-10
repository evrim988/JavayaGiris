package org.MethodsRepait;

public class Varargs {
    public static void main(String[] args) {

        System.out.println("İki sayının toplamı: " + toplam(3, 5));
        System.out.println("Üç sayının toplamı: " + toplam(9,8,7));

        //dizi olarak parametre verilen metoda istediğin kadar sayı girilebilir.
        toplam("abc",1,5,9,87,56,1,2,5,9,40);

        int toplam = toplam("evrim", 1, 2, 3, 4, 5);
        System.out.println(toplam);
    }

    //dışarıdan 2 int sayı parametre olarak alan ve toplamlarını int olarak dönen bir sum metodu yazın.
    public static int toplam(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    //dışarıdan 3 int sayı parametre olarak alan ve toplamlarını int olarak dönen bir sum metodu yazınız.
    public static int toplam(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }

    public static int toplam(String isimler,int... sayilar){
        int toplam = 0;
        for (int item: sayilar){
            toplam += item;
        }
        return toplam;
    }
}
