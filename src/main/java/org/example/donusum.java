package org.example;

public class donusum {
    public static void main(String[] args) {
        String metin = "101";
        Integer sayi = Integer.parseInt(metin);
        System.out.println(sayi);

        int sayi2 = 150;
        String metin2 = String.valueOf(sayi2);
        System.out.println(metin2);

        double sqrt = Math.sqrt((5 * 5) - (4 * 4));
        System.out.println(sqrt); //çıkan sonucun karekökünü aldırıp ekrana öyle çıktı verdi.

        double random = Math.random();
        System.out.println(random);

        int round = Math.round(10.3f); //en yakın tamsayıya yuvarlamış olduk.
        System.out.println(round);
        long round1 = Math.round(10.6); //en yakın tamsayıya yuvarlamış olduk.
        System.out.println(round1);
    }
}
