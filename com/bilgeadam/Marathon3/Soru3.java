package com.bilgeadam.Marathon3;

public class Soru3 {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		Aslan aslan = new Aslan("Simba", 100, 120);
		Yilan yilan = new Yilan("Terminator", 40, 225);

		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);

		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140));
		// hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50));

		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 200));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 2, 35));

		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		System.out.println("\n-------------------");

		hayvanatBahcesi.hayvaninBilgileriniYazdir("Simba");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Tiger");
		System.out.println("\n-------------------");

		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("Çiko");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
		System.out.println("\n-------------------");

		hayvanatBahcesi.hayvaninCinsiniBul("Kermit");
		hayvanatBahcesi.hayvaninCinsiniBul("Simba");
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
		hayvanatBahcesi.hayvaninCinsiniBul("Cobra");
		hayvanatBahcesi.hayvaninCinsiniBul("Tomy");

	}
}
