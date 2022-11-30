package com.bilgeadam.Marathon2;

public class Daire implements AlanHesapla,CevreHesapla{

	@Override
	public double alan(double uzunluk) {
		double alan;
		alan= Math.PI*uzunluk*uzunluk;
		System.out.println(alan);
		return alan;
		
	}

	@Override
	public double cevreHesapla(double uzunluk) {
		double cevre;
		cevre=Math.PI*2*uzunluk;
		System.out.println(cevre);
		return cevre;
		
	}

}
