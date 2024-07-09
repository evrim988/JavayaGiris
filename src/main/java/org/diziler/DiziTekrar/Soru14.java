package org.diziler.DiziTekrar;

import java.util.Arrays;

public class Soru14 {
    public static void main(String[] args) {

        String[] strings = new String[4];
        System.out.println(strings);
        //[Ljava.lang.String;@3feba861 böyle bir çıktı verir.
        //burada bize dönecek değer strings.toString() metodundan gelir. Onun içinde de
        // getClass().getName() + "@" + Integer.toHexString(hashCode()); satırı bize sınıf adını ve hashcode'u döner.
        // buna referansın gösterdiği adres gibi düşünebiliriz.

        // ben dizi içindeki elemanları görmeyi umuyorum:
        System.out.println(Arrays.toString(strings));
        //böyle yazdığımda [null, null, null, null] çıktısı verir.

    }
}
