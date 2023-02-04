package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args){
        System.out.println("Operator unari plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();

        System.out.println("Operator unari minus");
        int nilaiAwal1 = 5;
        int hasil1 = -nilaiAwal1;
        System.out.println("Hasil -5 = " + hasil1);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal2 = 5;
        nilaiAwal2++;
        System.out.println("Hasil 5++ = " + nilaiAwal2);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3--;
        System.out.println("Hasil 5-- = " + nilaiAwal3);
        System.out.println();

        System.out.println("Operator Komplemen Logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
