package com.intec;

import java.util.Objects;

public class Felis extends Animal{
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    private static int vaccinationCount;

    public Felis() {

    }

    {
        if(isAlive()){
            vaccinationCount++;
        }
    }

    public Felis(String name, int age, int shelterNo, int badgeNo) {
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }public Felis(String name){

    }



    public Felis(int badgeNo, int shelterNo) {

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        this.shelterNo = shelterNo;
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;
    }

    public void miauw(){//Ok

        System.out.println("Make sound 'miauw'");
    }
    public void miauw(int times){// Ik heb met Alexander gemakt.

        System.out.println("Cat miauwes : "+times +"times");


        for (int i = 0; i < times; i++) {
            System.out.println("miauw");

        }

    }

    public static int getNoOfVaccivatedCats(){

        return vaccinationCount;

    }

    public static void setVaccinationCount(int vaccitationCount ){
        Felis.vaccinationCount= vaccitationCount;
    }
    public static int getVaccitationCount() {
        return vaccinationCount;
    }

    @Override
    public String toString(){
        return "Felis{"+
                "name =' "+name +'\''+
                ", age="+age +
                ", shelterNo=" +shelterNo +
                ", badgeNo= "+ badgeNo+
                "}"+ super.toString();
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        Felis felis = (Felis) obj;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }
}

