package org.KararYapilari;

public class P01_KararYapilariOrnek {
	public static void main(String[] args) {
		
		int yas = 25;
		if (yas > 0 && yas < 18) {
			System.out.println("Bu içeriğe erişiminiz yok");
		}
		else if (yas >= 18 && yas <= 30) {
			System.out.println("İçeriği görüntülemek için yaşınız yeterli.");
		}
		else {
			System.out.println("Bu içerik sizin yaş grubunuza yönelik değildir.");
		}
	}
}