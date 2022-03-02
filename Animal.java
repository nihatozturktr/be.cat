package com.intec;

public class Animal {

    protected static int animalCount;
    private char size;
    private char coat;



    private String color;
    private double weight;



    {
        animalCount++;
    }

    public Animal(){

    }
    /** ik heb de constructor gemaakt
    */
    public Animal(char size, char coat, String color, double weight) {
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
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
    public static void setAnimalCount(int animalCount) {

        Animal.animalCount = animalCount;
    }


    public static int getAnimalCount() {

        return animalCount;
    }

    public char getSize() {

        return size;
    }

    public char getCoat() {

        return coat;
    }

    public String getColor() {

        return color;
    }

    public double getWeight() {

        return weight;
    }

    public void setSize(char size) {

        this.size = size;
    }

    public void setCoat(char coat) {

        this.coat = coat;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setWeight(double weight) {

        this.weight = weight;
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
