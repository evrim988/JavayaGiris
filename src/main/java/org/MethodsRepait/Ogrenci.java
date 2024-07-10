package org.MethodsRepait;

public class Ogrenci {
    public String Name;
    public String SurName;



}

 class OgrenciDeneme {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.Name = "evrim";
        ogrenci.SurName = "çalışkan";

        System.out.println(ogrenci.Name);
        System.out.println(ogrenci.SurName);
    }
}