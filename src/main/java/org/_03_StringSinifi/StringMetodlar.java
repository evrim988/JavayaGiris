package org._03_StringSinifi;

import java.util.Locale;

public class StringMetodlar {
    public static void main(String[] args) {

        // 1) lenght()
        String s = "Merhaba Dünya!";
        System.out.println(s.length()); //string ifadenin uzunluk sayısını ekrana çıktı verir.

        String s2="";
        System.out.println(s2.length()); //0 değerini döndürür.

        // 2) CharAt(int index)
        // Stringde belirtilen index deki karakteri döndürür. Index değerleri 0'dan başlar ve uzunluğun 1 eksiği arasındadır.

        //           01234
        String s3 = "Hello";
        System.out.println(s3.charAt(3)); //3 indexdeki karakterin çıktıısnı verir.

        //string ifadedeki son indexdeki karakterin çıktısını bulalım.
        System.out.println(s3.charAt(s3.length()-1)); //o çıktısını ekrana verir.

        System.out.println(s3.length()); // metnin uzunluğunu 5 olarak çıktı verir.
        // Bu yüzden lenght-1 dediğimizde metnin son karakterini çıktı verir.

        // 3) substring
        String str = "Merhaba dünya";
        System.out.println(str.substring(8));//metnin 8. indexden sonraki ifadeleri ekrana yazdırır.8.index dahil

        System.out.println(str.substring(0, 5)); //0.indexden başlar 5.index e kadar metnin çıktısını verir.
        //0.index dahil ancak 5.index dahil olmaz.
        // 0 -> inclusive,  5 -> exclusive

        System.out.println(str.substring(str.length() - 1));
        //son karakteri ekrana çıktı verir.

        // 4) concat : iki string ifadeyi birleştimede kullanılır.
        str = "Merhaba";
        System.out.println(str.concat(" Java15"));

        // 5) indexOf

        //     0123456
        str = "Merhaba";
        System.out.println(str.indexOf('a'));  //metnin içinde a harfini bulduğu ilk indexdeki değerin çıktıısnı verir.(4)
        System.out.println(str.indexOf('x')); //aradığı karakter Stringde bulamazsa -1 değerini döner.
        System.out.println(str.indexOf("haba")); //h yi ilk bulduğu indexin numarasını döner. 3 değerini döndü.

        //verilen strindeki 2. a'nın hangi indexde olduğunu bulalım.
        int a = str.indexOf('a');
        System.out.println("İlk a index: " + a);
        int a2 = str.indexOf('a',a+1); //ilk index değerinin üzerine +1 ekleyerek sonucu buluyoruz.
        System.out.println("İkinci a index: " + a2);

        System.out.println(str.lastIndexOf('a')); //String ifadenin son karakterin index değerini geri döner.Sondan aramay başlar.
        System.out.println(str.lastIndexOf('h')); //String ifadenin sondan başlatarak aramaya başlar. Bulduğu index dönüş yapar.

        // 6) equals, equalsIgnoreCase
        String str1 = "merhaba";
        String str2 = "merhaba";

        System.out.println(str1.equals(str2)); //iki string ifade birbirine eşit mi? yrue çıktısını döner.

        String str3 = "merhaba";
        String str4 = "MeRhAbA";
        System.out.println(str3.equalsIgnoreCase(str4)); //iki string ifade de büyük küçük harf dikkate almadan karşılaştırma yapar. true döner.

        if(str1.equals(str2)){
            System.out.println("Bu kelimeler birbirine eşit."); //kelimeler birbirine eşit çıktısı verir.
        }
        else {
            System.out.println("Bu kelimeler farklı");
        }

        // 7) compareTo
        //ilk karakterden başlayarak karşılaştırma yapar. Eğer ilk karakterler aynı ise sonraki karakterler arasında karşılaştırma devam eder.
        //eğer her 2 strinde aynı ise geriye 0 döner.

        str1 = "Cemil";
        str2 = "Suat";
        System.out.println(str1.compareTo(str2));
        //str1 ifadenin ilk harfindeki karakterin sayı karşılığı ve str2 deki ilk harfin sayı karşılığı olan sayıları birbirinden çıkartıp sonucu ekrana verir.

        // 8) toUpperCase
        System.out.println(str1.toUpperCase()); //hepsini büyük yazdı.

        str1 = "istanbul";
        System.out.println(str1.toUpperCase()); // İSTANBUL

        str1 = "i love istanbul";
        Locale englishLocale = new Locale("en","US");
        System.out.println(str1.toUpperCase(englishLocale)); // I LOVE ISTANBUL

        Locale englishLocaleNew = new Locale.Builder().setLanguage("en").setRegion("US").build();
        //ingilizce diline çevirmek için bu yeni yöntem kullanılıyor.

        System.out.println(str1.toUpperCase(englishLocaleNew)); // I LOVE ISTANBUL

        // 9) toLowerCase
        System.out.println(str1.toLowerCase()); //hepsini küçük yapıp öyle bir çıktı verir bize.

        // 10) trim : String ifadenin baştaki ve sondaki boşlukları kaldırır.
        str1 = "    Merhaba Java15  ";
        System.out.println(str1); //boşluklu halini çıktı olarak verdi.
        System.out.println(str1.trim()); //baştaki ve sondaki boşlukları kaldırıp öyle çıktı verir.

        // 11) replace
        str1 = "Merhaba Java15";
        System.out.println(str1.replace('a', 'o')); //Merhobo Java15 çıktısını verir. a gördüğü yere o ile değişikliği yaptı.

        // 12) contains
        str1 = "Java15";
        System.out.println(str1.contains("a")); //string ifadenin içinde a içeriyor mu içeriyorsa true döner.
        System.out.println(str1.contains("av")); // string ifadenin içinde ac içeriyor mu diye bakar içeriyorsa true döner.

        // 13) startsWith, endsWith
        str1 = "Java15";
        System.out.println(str1.startsWith("Ja")); // ifade Ja ile mi başlıyor bir bak dedik eğer doğruysa true sonucunu döner.
        System.out.println(str1.endsWith("av")); //ifade av ile mi bitiyor. doğruysa true döner.

        // 14) Escape Characters:
        System.out.println("Bugün \"hava\" yağmurlu"); // Bugün "hava" yağmurlu çıktısını verir.
        System.out.println("Ad\t\tSoyad");
        System.out.println("Evrim\tÇalışkan");
        System.out.println("Evrim\nÇalışkan");

        //soru
        str1 = "    Merhaba Dünya   ";
        System.out.println(str1.trim().replace(" ", "!"));
        System.out.println(str1.replace(" ", "!").trim());
    }

}
