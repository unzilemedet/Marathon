package com.bilgeadam.Marathon2;


public class Kare implements CevreHesapla,AlanHesapla,Kenar{

	@Override
	public double alan(double uzunluk) {
		double alan;
		alan=uzunluk*uzunluk;
		System.out.println(alan);
		return alan;
	}

    @Override
	public double cevreHesapla(double uzunluk) {
    	double cevre;
    	cevre=uzunluk*4;
    	System.out.println(cevre);
	return cevre;
		
	}

	@Override
	public void kenar(){
	System.out.println("4 kenari var");
		
	}


		
	}
