package com.intec;

public class PersianCat extends Felis{

    public PersianCat(int age, int shelterNo) {
        super( age, shelterNo);
    }

    public PersianCat(String name, int age, int shelterNo, int badgeNo){
        super(name,age,shelterNo,badgeNo);
    }

    public PersianCat(String name) {
        super(name);
    }
@Override// Alex ile ekledik
    public void miauw(){

    System.out.println("Persian cat miaws");// Alex ile duzelttik
    }

    @Override
    public String toString() {
        return super.toString()+ " Persians Cat";
    }
}
