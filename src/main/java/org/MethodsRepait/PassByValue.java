package org.MethodsRepait;
/**
 * Javada metodlar pass-by-value şeklinde çalışır.
 * primitive data type'lar parametre olarak kullanılırsa beklenildiği gibi gönderilen değişkenin değeri metod içindeki değişimden etkilenmez.
 * complex(reference) data type'lar parametre olarak kullanılırsa gönderilen nesnenin adresi metoda aktarılır. O yüzden metod içinde yapılan değişim direkt olarak o nesne üzerinde de gerçekleştirilir.
 *
 * pass-by-referance X pass-by-value
 */
public class PassByValue {
    public static void main(String[] args) {

        int sayi = 15;
        arttir(sayi);
        System.out.println("Sayi = " + sayi);

        Adet adetRef = new Adet();
        arrtirAdet(adetRef);
        System.out.println("adetRef in değeri: " + adetRef);
    }

    public static void arttir(int i){
        System.out.println(i);
        i++;
        System.out.println("i = " + i);
    }

    public static void arrtirAdet(Adet adet){
        adet.i++;
        System.out.println("adet.i = " + adet.i);
    }
}

class Adet{
    int i = 5;
}