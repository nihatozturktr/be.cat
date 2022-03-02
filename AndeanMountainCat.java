package com.intec;

public class AndeanMountainCat extends Felis{


    public AndeanMountainCat(int badgeNo, int shelterNo) {
        super(badgeNo, shelterNo);
    }
    public String miauw(String customSound){
        return customSound;
    }

    public boolean isAlive(){
        return false;
    }

    @Override
    public String toString() {
        return "The cat is mountain cat";
    }
}
