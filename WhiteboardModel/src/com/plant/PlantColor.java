package com.plant;

public enum PlantColor {
    RED("Romance"),
    GREEN("Green"),
    BLUE("Blue"),
    YELLOW("Yellow"),
    PURPLE("Purple"),
    ORANGE("Orange");

    //Instance Variable
    private final String display;

    //Constructor
    PlantColor(String display) {
        this.display = display;
    }

    //Accessor methods
    public String getDisplay() {
        return display;
    }

    //Return display as String
    @Override
    public String toString() {
        return getDisplay();
    }
}

