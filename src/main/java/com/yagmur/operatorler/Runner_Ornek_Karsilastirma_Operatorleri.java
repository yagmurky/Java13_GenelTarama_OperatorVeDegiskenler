package com.yagmur.operatorler;

public class Runner_Ornek_Karsilastirma_Operatorleri {

    public static void main(String[] args) {

        int sayi1=28;
        int sayi2=17;

        boolean esitMi = sayi1 == sayi2;
        boolean buyukMu = sayi1 > sayi2;
        boolean kucukMu = sayi1 < sayi2;

        System.out.println("Eşit mi....:" +esitMi);
        System.out.println("Büyük mü...:" +buyukMu);
        System.out.println("Küçük mü...:" +kucukMu);


    }
}
