package com.bilgeadam.Marathon3;

public abstract class Hayvan {

	Hayvan(String ad, int kilo, int uzunluk) {
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
	}

	public void bilgileriYazdir() {
		System.out.println(String.format("Hayvan [ad=%s, kilosu=%d, uzunlugu=%d, Tehlikeli mi : %b ]", this.ad, this.kilo, this.uzunluk, this.tehlikeliMi));
	}

	public abstract void icindesesCikar();
	public abstract void cinsiniBul();
	public abstract void hareketEt();

	private String ad;
	private int kilo;
	private int uzunluk;
	private boolean tehlikeliMi;

	// Getters
	public String getAd() {
		return ad;
	}

	public int getKilo() {
		return kilo;
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public boolean isTehlikeliMi() {
		return tehlikeliMi;
	}

	// Setters
	public void setAd(String ad) {
		this.ad = ad;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public void setTehlikeliMi(boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}
}
