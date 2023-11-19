package com.yagmur.operatorler;

public class Runner_Ornek_Mantiksal_Operatorler {
    public static void main(String[] args) {

        int yas = 15;
        boolean ehliyetVar = true;
        boolean surusIzin = true;

        boolean ehliyetVeYasKontrol = (yas >= 18) && ehliyetVar;
        boolean surusIzinKontrol = ehliyetVeYasKontrol && surusIzin;

        System.out.println("Ehliyet ve Yaş Kontrolü: " + ehliyetVeYasKontrol);
        System.out.println("Sürüş İzni Kontrolü: " + surusIzinKontrol);
    }
}
