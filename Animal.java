package com.intec;

public class Animal {


    private char size;//Ok
    private char coat;//OK
    private String color;//OK
    private double weight;//OK

    protected static int animalCount;//OK
    static {
        animalCount++;//OK
    }
    public Animal(  ){//    OK  /** ik heb de constructor gemaakt  */

    }


    public Animal(char size, char coat, String color, double weight) {//OK
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void makeNoise() {
        System.out.println("miyav");
    }
    public void eat() {
        System.out.println(" coshida kattenvoer");
    }

    public void sleep() {
        System.out.println("hoooor");
    }

    public boolean isAlive() {

        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
