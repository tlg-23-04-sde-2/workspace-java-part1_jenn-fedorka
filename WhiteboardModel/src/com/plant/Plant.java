package com.plant;

import javax.management.MXBean;

//class definition to model the care of a plant
public class Plant {

    //Static Variables
    public static final double MIN_HEIGHT = 0.0;
    public static final double MAX_HEIGHT = 500.0;

    //Instance variables
    private String name;
    private Boolean hasFlower;
    private PlantColor display = PlantColor.GREEN;
    private Boolean isVeriegated;
    private double height;

    //Constructors
    public Plant() {
    }

    public Plant(String name, PlantColor display) {
        this();
        setName(name);
        setDisplay(display);
    }

    public Plant(String name, PlantColor display, Boolean hasFlower) {
        this(name, display);
        setHasFlower(hasFlower);
    }

    public Plant(String name, Boolean hasFlower, PlantColor display, Boolean isVeriegated) {
        this(name, display, hasFlower); //delegated to construct above
        setVeriegated(isVeriegated);
    }

    public Plant(String name, Boolean hasFlower, PlantColor display, Boolean isVeriegated, double height) {
        this(name, hasFlower, display, isVeriegated);
        setHeight(height);
    }

    //Create business methods
    public void water() {
        System.out.println("The " + getName() + " has been watered.");
    }

    public void fertilize() {
        System.out.println("Fertilize the " + getName() + " again in 90 days.");
    }

    public void prune() {
        System.out.println("All of the dead leaves have been removed from the " + getName() + ".");
    }

    //accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasFlower() {
        return hasFlower;
    }

    public void setHasFlower(Boolean hasFlower) {
        this.hasFlower = hasFlower;
    }

    public boolean isVeriegated() {
        return isVeriegated;
    }

    public void setVeriegated(Boolean verigated) {
        this.isVeriegated = verigated;
    }

    public PlantColor getDisplay() {
        return display;
    }

    public void setDisplay(PlantColor display) {
        this.display = display;
    }

    public double getHeight() {
        return height;
    }

    //Accessor method with validation
    public void setHeight(double height) {
        if (height >= MIN_HEIGHT && height <= MAX_HEIGHT) {
            this.height = height;
        } else {

            System.out.printf("%s is not a valid height. Number must be between %s and %s.\n"
                    , height, MIN_HEIGHT, MAX_HEIGHT);
        }

    }

    //Return a description of the plant
    public String toString() {
        return String.format("Plant: Name = %s, Has Flower(s)? = %s, Color = %s, Is Variegated? = %s, Height = %s.", getName(),
                hasFlower, getDisplay(), isVeriegated, getHeight());
    }
}