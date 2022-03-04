package com.intec;

public class Panthera extends Animal {

    public String roar(){// Duzelt String donecek

       return "Roor";


    }
    public void hunt(){
        System.out.println("hunting");

    }

    @Override
    public String toString() {
        return "Panthera{}";
    }
}
