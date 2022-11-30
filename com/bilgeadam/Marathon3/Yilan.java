package com.bilgeadam.Marathon3;

public class Yilan extends Surungen {

	Yilan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		super.setTehlikeliMi(true);
	}

	public void surun() {
		System.out.println("Yılan --> Surun methodu");
	}

	@Override
	public void icindesesCikar() {
		System.out.println(this.getAd() + " tıslama sesi çıkarıyor...");
	}

	@Override
	public void cinsiniBul() {
		System.out.println(this.getAd() + " bir Sürüngen");
	}

	@Override
	public void hareketEt() {
		System.out.println(this.getAd() + " isimli yılan sürünüyor");
	}
}
