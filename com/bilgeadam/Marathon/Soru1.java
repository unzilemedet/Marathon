package com.bilgeadam.Marathon;

public class Soru1 {

	public static void main(String[] args) {
        yildizYazdir();
    }

    public static void yildizYazdir(){
        for(int i = 0; i<4; i++){
            for(int j = 0; j<7; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 6; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

	}

