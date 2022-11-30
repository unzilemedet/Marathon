package com.bilgeadam.Marathon;

import java.util.HashSet;
import java.util.Set;

public class Soru2 {


		public static void main(String[] args) {
	
		int[] sayiDizisi= {9, 7, 5, 3, 7, 7, 3, 18 , 2, 0,7 };
		tekrarEdenSayiyiBul(sayiDizisi);
		int sayiDizisi2[] = { 0, 1, 5, 3 };
		tekrarEdenSayiyiBul(sayiDizisi2);
		}
		public static void tekrarEdenSayiyiBul(int[] sayiDizisi) {
			Set<Integer> goruldu = new HashSet<>();
	        int tekrarSayisi = 0;
	        int tekrarEdenSayi = 0;
	        for(int i=0; i<sayiDizisi.length; i++){
	            if(goruldu.contains(sayiDizisi[i])){
	                tekrarEdenSayi = sayiDizisi[i];
	                tekrarSayisi++;
	            }
	            else{
	                goruldu.add(sayiDizisi[i]);
	            }
	        }
	        if(tekrarSayisi == 0){
	            System.out.println("Tekrar eden sayi bulunamamistir.");
	        }
	        else{
	            System.out.println(tekrarEdenSayi + " sayisi " + tekrarSayisi + " kez tekrar ediyor.");
	        }
		}
		
}

	


