package com.bilgeadam.Marathon3;

public class Maymun extends MemeliHayvan {
	Maymun(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		super.setTehlikeliMi(false);
	}

	public void yuru() {
		System.out.println("Maymun --> Yürü");
	}

	@Override
	public void icindesesCikar() {
		System.out.println(this.getAd() + " uaua sesi çıkarıyor...");
	}

	@Override
	public void cinsiniBul() {
		System.out.println(this.getAd() + " bir Memeli Hayvan");
	}

	@Override
	public void hareketEt() {
		System.out.println(this.getAd() + " isimli maymun yürüyor");
	}


}
