package com.entertainment;

/*
 * Business class (system class) to model the workings of a television
 */
public class Television {

    //static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};
    public static int getInstanceCount() {
        return instanceCount;
    }

    // instance variables or fields (properties or attributes)
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;   //otherwise, null if client doesn't say

    private boolean isMuted; //muting behavior
    private int oldVolume; //internal only


    //constructors
    public Television() {
        instanceCount++; //instanceCount = instanceCount +1
    }

    public Television(String brand) {
        this(); //delegate to constructor above
        setBrand(brand); //delegate to setters
    }

    public Television(String brand, int volume) {
        this(brand); //delegate to constructor above
        setVolume(volume);
    }

    //3arg constructor
    public Television(String brand, int volume, DisplayType display) {
        this(brand,volume);
        setDisplay(display);
    }

    //business methods or operations
    public void mute(){
        if (!isMuted()) { //not currently muted
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public void turnOn() {
        //call private method for this task
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }


    //accessor (set/get) methods- provide controlled access to the objects fields
    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        if (brand.equals("Samsung") || brand.equals("LG") || brand.equals("Toshiba") || brand.equals("Sony")) {
            this.brand = brand;
        }
        else {
            System.out.println("error");
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        }
        else {
            System.out.println( getVolume() + "error");
        }

    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted(){
        return this.isMuted;

    }
    private boolean verifyInternetConnection(){
        return true;
    }

/*    public String toString(){
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: brand=" + getBrand() + ",volume=" + volumeString;
    }*/
    //returns a sentence as a string that describes the object
    public String toString() {
        return "Television: brand = " + getBrand() +", volume= " + getVolume() + ", Display = " + getDisplay();
    }

}
