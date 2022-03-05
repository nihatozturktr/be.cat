package com.intec;

public class NorwegianForestCat extends Felis{

    public NorwegianForestCat(String name) {
        super(name);
    }
    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo){
        super(name,age,shelterNo,badgeNo);
    }

    public void miauwlnNorwegian(){
        System.out.println("Norvegians cat miauw");

    }
    @Override
    public String toString() {
        return "NorwegianForestCat{}" + super.toString()  ;
    }
}
