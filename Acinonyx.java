package com.intec;

public class Acinonyx extends Animal{// cita

    private double speed;

    public Acinonyx() {

    }

    public Acinonyx(double speed) {//Constructor
               this.speed = speed;
    }

    public double getSpeed() {//Get
        return speed;
    }

    public void setSpeed(double speed) {//Set
        this.speed = speed;
    }

    public double run(double distance){
        return distance;

    }

    static void kiauuww(){

        System.out.println("kiauuww");




    }
}
