package com.bilgeadam.Marathon3;

public class Aslan extends MemeliHayvan {
	Aslan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		super.setTehlikeliMi(true);
	}

	public void yuru() {
		System.out.println("Aslan --> Yürü");
	}

	@Override
	public void icindesesCikar() {
		System.out.println(this.getAd() + " kükrüyor...");
	}

	@Override
	public void cinsiniBul() {
		System.out.println(this.getAd() + " bir Memeli Hayvan");
	}

	@Override
	public void hareketEt() {
		System.out.println(this.getAd() + " isimli aslan yürüyor");
	}
}
