package org.MethodsRepait;

public class FinalParametreliMethod {
    public int hiz=0;

    public static void main(String[] args) {

        FinalParametreliMethod object = new FinalParametreliMethod();
        System.out.println(object.hiz);
        object.hizArttir(50);
        System.out.println(object.hiz);//50 değerini çıktı olarak vermiş oldu.

    }

    public void hizArttir(final int yeniHız){
       // yeniHız = yeniHız + 10; //parametre değişkenini final yaptığımız bu değişkenin değeri değiştirilemez oluyor.
        hiz = yeniHız;

    }
}
