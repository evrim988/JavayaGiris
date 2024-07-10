package org.Methods;

public class methods01 {
    public String Name;
    public int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<100 && yas>10)
            this.yas = yas;
        else
            System.out.println("Yaş değeri 10-100 arası olabilir.");
    }
}

 class Deneme{
    public static void main(String[] args) {
        methods01 calisan = new methods01();
        calisan.setYas(120);
    }
}