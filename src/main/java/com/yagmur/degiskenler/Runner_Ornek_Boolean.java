package com.yagmur.degiskenler;

public class Runner_Ornek_Boolean {
    public static void main(String[] args) {
        //boolean: Mantıksal değerleri temsil eder,
        // evet veya hayır cevabı döner (true veya false).
        boolean dogruMu = true;

        int sayi1 = 5;
        int sayi2 = 10;
        boolean kucuktur = sayi1 < sayi2;
        boolean buyuktur = sayi1 > sayi2;

        System.out.println(sayi1 + " sayısı " + sayi2 + " sayısından küçük mü? " + kucuktur);
        System.out.println(sayi1 + " sayısı " + sayi2 + " sayısından büyük mü? " + buyuktur);
    }
}
