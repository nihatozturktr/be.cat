package com.intec;

public class SiameseCat extends Felis{


    public SiameseCat(String name) {
        super(name);
    }

    public SiameseCat(int badgeNo, int shelterNo) {
        super(badgeNo, shelterNo);

    } public SiameseCat(String name, int age, int shelterNo, int badgeNo){
        super(name,age,shelterNo,badgeNo);
    }
    @Override
    public void miauw() {
        super.miauw();
    }

    @Override
    public String toString() {
        return " Siamese Cat "+getName();
    }
}
