package com.company;

public class Main {

    public static void main(String[] args) {
        galaxy objectA = new galaxy(" Samsung ",Hotels.MAYAMI, " S21 Ultra ");
        System.out.println(objectA.smartInfo());
        System.out.println(objectA.smartphoneInfo(1111111));

        
        Proverka objectB = new Proverka(" Samsung ",Hotels.AMERIKA ,
                " S20 Ultra "," Samsung "," Galaxy " );
        System.out.println(objectB.smartInfo());
        System.out.println(objectB.smartphoneInfo("S21 Pro"));


        Proverka objectC = new Proverka(" Samsung ",Hotels.SINGAPUR,
                " S8 "," Samsung "," Galaxy " );
        System.out.println(objectC.smartInfo());


    }
}
