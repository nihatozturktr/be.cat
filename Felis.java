package com.intec;


import java.util.Objects;

public class Felis extends Animal{




    private static int vaccinationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;


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

    public void miauw(){

        System.out.println("Make sound 'miauw'");
    }
    public int miauwTimes(int times){
        return times;
    }
    public static int getNoOfVaccivatedCats(){

        return vaccinationCount;
    }public static void setVaccinationCount(int vaccitationCount ){
        Felis.vaccinationCount= vaccitationCount;
    }
    public static int getVaccitationCount() {
        return vaccinationCount;
    }
// Override
    @Override
    public String toString() {
        return name;
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

