package com.intec;

public class NorwegianForestCat extends Felis{

    public NorwegianForestCat(String name) {
        super(name);
    }
    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo){
        super(name,age,shelterNo,badgeNo);
    }

    public void miauwlnNorvegian(){
        System.out.println("Norvegians cat miauw");

    }
    @Override
    public String toString() {
        return  super.toString() + " is a Norwegian Forest cat " ;
    }
}
