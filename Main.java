package com.intec;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TurkishVanCat cat1 = new TurkishVanCat("maya",10,12,45,"Minnos");
        TurkishVanCat cat2 =new TurkishVanCat("pamuk");




        System.out.println("-------2-----------");


        Animal animal = new Animal('l','k',"brown",15.2);
        AndeanMountainCat aMcat =new AndeanMountainCat();






        Felis[] catArr2={new NorwegianForestCat("Anja",7,12,23),
                new SiameseCat("Koko",10,333,666),
                new PersianCat("Jasmine",20,555,666),
                new TurkishVanCat("Boncuk",10,20,15,"kedi"),
                new PersianCat("Diva",14,222,444),
                new NorwegianForestCat("Apple",10,11,111),
                new TurkishVanCat("maya",10,12,45,"Minnos")};

        System.out.println(Arrays.toString(catArr2));



        System.out.println("-------3-----------");

        System.out.println("Animal Count :"+Animal.getAnimalCount());
        System.out.println("VaccitationCount :"+Felis.getVaccitationCount());







 }
 }
