package org.diziler.DiziTekrar;

public class _01_DizilerTeorik {
    public static void main(String[] args) {

        //Dizi Tanımlama
        int[] intArray = {1,2,3,4,5};
        String[] stringArray = {"abc","def","ghı"};

        //kullanım 2
        int[] intArray2 = new int[5];
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;
        //boyutundan dışarı çıkamam bir değer daha atayamam hata vermiş olur.

        //dizinin eleman sayısı byte,short,int gibi bir değişkenden de  alınabilir.

        int elemanSayisi = 5;
        boolean[] booleanDizi = new boolean[elemanSayisi];
        //şeklinde bir kullanım olabiliyor.

        //dizideki elemanlara erişelim.
        int[] intArray3 = new int[5];
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;

        System.out.println("intArray[0]: " + intArray3[0]); //0.indexde hangi değer varsa onu çıktı olarak verir.
        System.out.println("intArray[1]: " + intArray3[1]); //1.indexde hangi değer varsa onu çıktı olarak verir.
       //gibi gibi böyle dizinin boyutu kadar çıktı almaya devam edebiliriz.

        //şimdi şurayı inceleyelim.
        int elemanSayisi1 = 5;
        boolean[] booleanDizi1 = new boolean[elemanSayisi];

        System.out.println("booleanDizi[0]: " + booleanDizi1[0]);
        System.out.println("booleanDizi[1]: " + booleanDizi1[1]);
        System.out.println("booleanDizi[2]: " + booleanDizi1[2]);
        System.out.println("booleanDizi[4]: " + booleanDizi1[4]);
        //bu çıktıların hepsinde "false" sonucunu döner. Çünkü bunlara henüz değer atamadık default olarak hepsinde false dönüyor.

        int[] intArray4 = new int[5];
        //bu diziyi ekrana çıktı olarak yazdıralım.
        System.out.println("intArray4[0]: " + intArray4[0]);
        System.out.println("intArray4[1]: " + intArray4[1]);
        System.out.println("intArray4[4]: " + intArray4[4]);
        //bu çıktılarda da 0 sonucunu döner. Çünkü herhangi bir atama yapmadık.

        //String ifadeli olan bir dizide de sonuç "null" olarak döner. Çünkü string ifadelerin default değeri null dur.
        String[] isimler=new String[10];
        System.out.println("isimler[0]: " + isimler[0]);
        System.out.println("isimler[1]: " + isimler[1]);

        //şimdi default olan değerlere bir değer atayalım.
        isimler[0] = "Evrim";
        isimler[8] = "Ali";
        System.out.println("isimler[0]: " + isimler[0]); //0. index deki değeri Evrim ismini yazdı. Diğer değerler hala null
        System.out.println("isimler[5]: " + isimler[5]); //5.index de değer olmadığı için null değerini atadı.
        System.out.println("isimler[8]: " + isimler[8]); //8.index e ali değerini yazdı.

        //bu zamana kadar dizinin elemanlarını tek tek yazdırmaya uğraştık şimdi foeach döngüsüyle  dizinin tüm elemanlarını yazdıralım.
        for (String item: isimler){
            System.out.println(item);
        }
        //burdaki for döngüsü aslında foreach döngüsüdür. İçinde hangi tipte dönüleceğini tanımlıyoruz.
        // daha sonra isim veriyoruz döngüye. item yazdım ben mesela.
        // : ifadesinden sonra dizinin adını yazıyoruz ve böylelikle döngüyü tanımlamış oluyoruz.
        //Evrim
        //null
        //null
        //null
        //null
        //null
        //null
        //null
        //Ali
        //null
        //böyle bir çıktı vermiş oldu.




    }
}
