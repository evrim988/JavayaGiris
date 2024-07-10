package org.MethodsRepait;

public class MetotTanımları {
    public static void main(String[] args) { //main metodu da bir metotdur fakat 1 kere çağırılabiliyor.

        //Parametresiz geriye değer döndürmeyen metot çağırımı
        hosgeldiniz();

        //Parametresiz geriye değer döndüren metot çağırımı
        System.out.println(hosgeldinizReturn()); //geriye değer döndüren bir metot olduğu için bunu bir ekran çıktısına aldım.
        //yada bir değişkende tutma ihtimalimizde oluyor bu durumda.

        //Parametreli geriye değer döndürmeyen metot çağırımı
        hosgeldiniz("Evrim");

        //Parametreli geriye değer döndüren metot çağırımı
        isimYaz("Evrim");

        MetotTanımları object = new MetotTanımları();
        object.hosgeldinİsimYaz("Evrim");
        //görüldüğü gibi static olmayan metotları class adıyla newleyerek çağırabiliyoruz.

    }

    //Parametresiz geriye değer döndürmeyen metot tanımı
    public static void hosgeldiniz(){
        System.out.println("Hoşgeldiniz!!");
    }

    //Parametresiz geriye değer döndüren metot tanımı
    public static String hosgeldinizReturn(){
       return "Hoşgeldiniz!!";
    }

    //Parametreli geriye değer döndürmeyen metot tanımı
    public static void hosgeldiniz(String isim){
        System.out.println("Hoşgeldiniz! " + isim);
    }

    //Parametreli geriye değer döndüren metot tanımı
    public static   String isimYaz(String isim){
        return isim;
    }

    public String hosgeldinİsimYaz(String isim){
        return "Hoşgeldin!" + isim;
    }

}
