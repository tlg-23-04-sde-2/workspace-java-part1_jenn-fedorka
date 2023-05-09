/*
 * Business class (system class) to model the workings of a television
 */
class Television {

    //static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // instance variables or fields (properties or attributes)
    private String brand;
    private int volume;

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

    //business methods or operations

    public void turnOn() {
        //call private method for this task
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public String getBrand() {
        return brand;
    }

    //accessor (set/get) methods- provide controlled access to the objects fields
    public void setBrand(String brand) {
        if (brand.equals("Samsung") || brand.equals("Lg") || brand.equals("Toshiba") || brand.equals("Sony")) {
            this.brand = brand;
        } else {
            System.out.println("error");
        }

    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        else {
            System.out.println("error");
        }

    }

    private boolean verifyInternetConnection(){
        return true;
    }
    //returns a sentence as a string that describes the object
    public String toString() {
        return "Television: brand = " + getBrand() +", volume= " + getVolume();
    }


}
