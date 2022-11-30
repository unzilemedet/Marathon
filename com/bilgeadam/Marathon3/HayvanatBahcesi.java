package com.bilgeadam.Marathon3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {

	private List<Hayvan> hayvanListesi = new ArrayList<Hayvan>();

	private Hayvan hayvaniBul(String hayvanAdi) {
		for (Hayvan h : hayvanListesi) {
			if (h.getAd().equals(hayvanAdi)) {
				return h;
			}
		}
		return null;
	}

	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		if (hayvaniBul(m.getAd()) ==  null) {
			this.hayvanListesi.add(m);
			System.out.println(m.getAd() + " isminde bir hayvan Hayvanat Bahçesine eklendi!");
		} else {
			System.out.println(m.getAd() + " isminde bir hayvan Hayvanat Bahçesinde zaten mevcut!");
		}
	}

	public void bahceyeSurungenEkle(Surungen s) {
		if (hayvaniBul(s.getAd()) == null) {
			this.hayvanListesi.add(s);
			System.out.println(s.getAd() + " isminde bir hayvan Hayvanat Bahçesine eklendi!");
		} else {
			System.out.println(s.getAd() + " isminde bir hayvan Hayvanat Bahçesinde zaten mevcut!");
		}
	}

	public void hayvanSesCikarsin(Hayvan h) {
		h.icindesesCikar();
	}

	public void hayvaninCinsiniBul(String hayvanAdi) {
		Hayvan h = hayvaniBul(hayvanAdi);
		if (h != null) {
			h.cinsiniBul();
		} else {
			System.out.println(hayvanAdi + " isimli hayvan bu Hayvanat Bahçesinde yok!");
		}
	}

	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		Hayvan h = hayvaniBul(hayvanAdi);
		if (h != null) {
			h.bilgileriYazdir();
		} else {
			System.out.println(hayvanAdi + " isminde bir hayvan Hayvanat Bahçesinde yok");
		}
	}

	public void hayvaniHareketEttir(String hayvanAdi) {
		Hayvan h = hayvaniBul(hayvanAdi);
		if (h != null) {
			h.hareketEt();
		} else {
			System.out.println(hayvanAdi + " isminde bir hayvan Hayvanat Bahçesinde yok");
		}
	}

}
