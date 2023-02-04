package com.dicoding.javafundamental.operator;

public class OperatorConditional {

    public static void main(String[] args){
        int value = 4;
        int value1 = 5;

        System.out.println("Conditional AND");
        boolean result = value == 3 && value1 == 5;
        boolean result1 = value != 3 && value1 == 5;

        System.out.println("Hasil operator AND pada syarat value == 3 && value1 == 5 adalah " + result);
        System.out.println("Hasil operator AND pada syarat value != 3 && value1 == 5 adalah " + result1);
        System.out.println();
        System.out.println("Conditional OR");

        result = value == 3 || value1 == 5;
        result1 = value != 3 || value1 == 5;

        System.out.println("Hasil operator OR pada syarat value == 3 || value1 == 5 adalah " + result);
        System.out.println("Hasil operator OR pada syarat value != 3 || value1 == 5 adalah " + result1);
    }
}
