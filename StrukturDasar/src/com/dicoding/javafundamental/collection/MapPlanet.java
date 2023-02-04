package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {

    public static void main(String[] args){
        //menggunakan HashMap
        Map<String, Planet> planets = new HashMap();
        planets.put("Key-1", new Planet("Mercury", 0.06)); //method put() untuk menambahkan objek ke map
        planets.put("Key-2", new Planet("Venus", 0.82));
        planets.put("Key-3", new Planet("Earth", 1.00));
        planets.put("Key-4", new Planet("Mars", 0.11));
        planets.put("Key-4", new Planet("Mars-X", 0.11)); //menambahkan ke Map dengan key yang sama


    }
}
