package com.yagmur.operatorler;

public class Runner_Ornek_Aritmetik_Operatorler {
    public static void main(String[] args) {


        int sayi1 = 5;
        int sayi2 = 11;
        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;
        int carpim = sayi1 * sayi2;
        double bolum = (double) sayi1 / sayi2;
        int mod = sayi1 % sayi2;

        System.out.println("Toplam....:" + toplam);
        System.out.println("Fark......:" + fark);
        System.out.println("Carpim....:" + carpim);
        System.out.println("Bölüm.....:" + bolum);
        System.out.println("Mod.......:" + mod);

    }
}
