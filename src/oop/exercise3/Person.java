package oop.exercise3;

public class Person {
    private String fullName;
    private double weight;
    private int height;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String show(){
        return String.format("Name: %s\nWeight: %s\nHeight: %s", this.fullName, this.weight, this.height);
    }
}
