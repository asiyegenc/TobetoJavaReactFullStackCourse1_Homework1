package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String ortaMetin = "İlginizi çekebilir.";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 28.76;
        double dolarBugun = 28.50;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun<dolarDun) { //false
            okYonu = "down.swg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) { //false
            okYonu = "up.swg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.swg";
            System.out.println(okYonu);
        }


        //array

        String[] krediler = {"Hızlı kredi al", "Maaşını Halkbanktan al", "Mutlu emekli ol"};
        for(int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        }
        }