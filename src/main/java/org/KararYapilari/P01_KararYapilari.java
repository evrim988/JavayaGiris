package org.KararYapilari;

public class P01_KararYapilari {
    public static void main(String[] args) {
        //if(mantıksal ifade)

        if (5 < 10) {
            System.out.println("Koşul true döndüğü için bu satır ekrana yazdırılır.");
        }

        if (50 < 10) {
            System.out.println("Koşul true döndüğü için bu satır ekrana yazdırılır.");
            //50 10 dan küçük olmadığı için if in içine hiç girmez.
        }

        if (50 < 10)
            System.out.println("Koşul true döndüğü için bu satır ekrana yazdırılır2."); //bu satırı yazdırmadı.
        System.out.println("2.satır 2 koşul");
        //bu satırı yazdırır. Çünkü parantezsiz sadece tek satır yazdırır.

        if (5 < 10) {
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
            //görüldüğü gibi istediğim kadar satır yazıp bunları if in içinde tutabiliyorum. Parantez olduğu için...
        }

        int sicaklik = 10;
        if (sicaklik > 20) {
            System.out.println("Klimayı çalıştır.");
        } else {
            System.out.println("Klimayı durdur");
        }

        sicaklik = 20;
        if (sicaklik < 0) {
            System.out.println("Klimayı çok aç");
        } else if (sicaklik < 10) {
            System.out.println("Klimayı az aç");
        } else if (sicaklik < 20) {
            System.out.println("Klimayı azıcık aç");
        } else {
            System.out.println("Klimayı kapat");
        }

        System.out.println("if else if blogğundan sonraki kodlar...");
    }
}
