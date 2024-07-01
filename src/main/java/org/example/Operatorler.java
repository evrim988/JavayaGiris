package org.example;

public class Operatorler {
    public static void main(String[] args) {

        int i = 5;
        double d = 2.3;

        //i=i+d //ikili aritmetik operatör ile kullanılan değerlerden bir tanesi double ise sonuç double dır.
        //O yüzden bu sonucu int türünde bir değişkende tutamayız.

        i = (int) (i + d); //önce int e cast(çevir) et. sonra işlemi yap.
        //bunu yaptığımızda double türündeki veriyi kaybetmiş oluruz.Noktalı kısım sonrası gitmiş olur.

        byte b1 = 8, b2 = 5, b3;

        b3 = (byte) (b1 + b2);
        //normalde burda hata veriyor çünkü otomatik olarak int olarak algılıyor program
        // ama biz sen yinede byte a çevir diyoruz.


        int x, y;
        int sayi = 12;

    }
}
