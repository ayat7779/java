package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args){
        //Deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "Riki";
        heroes[1] = "Sven";
//        heroes[2] = "zeus";
        System.out.println(heroes[1]);

        //Menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); //method add() untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); //objek lain masih bisa terus ditambahkan ke List

        System.out.println("List planets awal : ");
        for (int i = 0; i < planets.size(); i++){ //method size() untuk mendapatkan ukuran list
            //method get() untuk melihat isi pada index i
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("venus"); //method remove() untuk mengeluarkan objek dari List

        System.out.println("List planets akhir : ");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }
}
