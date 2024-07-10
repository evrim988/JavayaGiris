package org.MethodsRepait;

public class MethodOverloading {
    public static void main(String[] args) {

        //Method Overloading:
        // Aynı isimde farklı parametre tiplerinde veya farklı parametre sayılarında metodlar yazma işlemine overloading denir.

        int toplam1 =  toplam(15,25);
        System.out.println(toplam1);

        int toplam2 = toplam(10,25,30);
        System.out.println(toplam2);

        double toplam3 = toplam(0.5,3.78,6.95);
        System.out.println(toplam3);

        String toplam4 = toplam(9,6,8,4);
        System.out.println(toplam4);
        //Toplama işleminin sonucu: 27 çıktısını verir.
    }

    //dışarıdan 2 int sayı parametre olarak alan ve toplamlarını int olarak dönen bir sum metodu yazın.
    public static int toplam(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    //dışarıdan 3 int sayı parametre olarak alan ve toplamlarını int olarak dönen bir sum metodu yazın.
    public static int toplam(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }

    //dışarıdan 3 double sayı parametre olarak alan ve toplamlarını double olarak dönen bir sum metodu yazın.
    public static double toplam(double sayi1, double sayi2, double sayi3){
        return sayi1 + sayi2 + sayi3;
    }
    public static String toplam(int sayi1, int sayi2, int sayi3, int sayi4){
        return "Toplama işleminin sonucu: " + (sayi1 + sayi2 + sayi3 + sayi4);
    }
}
