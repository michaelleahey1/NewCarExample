package org.example;

public class Car {
    //objects

    private String model;
    private String make;
    private double price;
    private int year;
    private String color;

    //constructors

    public Car(String model, String make, double price, int year, String color) {
        this.model = model;
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }


    // getters/setters


    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
        Car c = new Car("Ford", "mustang",70000,1968,"yellow");
        System.out.println(" Model " + c.getModel() + " Make: " + c.getMake() + " Price " +c.getPrice() +  " Year " + c.getYear() + " Color" + c.getColor() );
        Car c1 = new Car("Chevy", "Corvette", 80000,1963, "red");
        System.out.println(" Model " + c1.getModel() + " Make " + c1.getMake() + " Price " + c1.getPrice() +  " Year " + c1.getYear() + " Color " + c1.getColor() );
        Car c2 = new Car("Pontiac", "GTO,", 26000, 1970, "green");
        System.out.println(" Model " + c2.getModel() + " Make " + c2.getMake() + " Price "+c2.getPrice() +  " year " + c2.getYear() + " Color " + c2.getColor());
    }
}