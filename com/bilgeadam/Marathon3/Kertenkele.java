package com.bilgeadam.Marathon3;

public class Kertenkele extends Surungen {
	Kertenkele(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		super.setTehlikeliMi(false);
	}

	public void surun() {
		System.out.println("Kertenkele --> Sürün");
	}

	@Override
	public void icindesesCikar() {
		System.out.println(this.getAd() + " tanımlanamayan bir ses çıkarıyor...");
	}

	@Override
	public void cinsiniBul() {
		System.out.println(this.getAd() + " bir Sürüngen");
	}

	@Override
	public void hareketEt() {
		System.out.println(this.getAd() + " isimli kertenkele sürünerek gidiyor");
	}
}
