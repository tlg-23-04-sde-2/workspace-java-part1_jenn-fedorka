package dont.wakeme;

/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class".
 * This class definition does not have a main() method- most class don't.
 */
class AlarmClock {
    //Static variables shared by the class
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // properties or attributes - called "instance variables" or "fields" in Java
    private int snoozeInterval = 5; // default value when client doesn't specify one
    private int repeat = 1; //default value when client doesn't specify

    //constructors
    public AlarmClock(){
        //no-op
    }

    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval); //delegate to setting for any validation or conversion
    }

    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);  //delegate to constructor above me for snoozeInterval
        setRepeat(repeat);    //delegate to setting for repeat
    }

    //business methods - these perform "business tasks' or operations
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
        }

    //Accessor methods (get/set methods) - provide controlled access to the objects fields
    public int getSnoozeInterval() {
         return snoozeInterval;
        }

    //Done: business constraint- must be between [1-20] inclusive
    //no magic numbers  1 and 20. use variables instead
    public void setSnoozeInterval (int snoozeInterval) {
            if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) { //valid
                this.snoozeInterval = snoozeInterval;
            }
            else{
                System.out.println("Invalid SnoozeInterval: " + snoozeInterval +
                        ". Must be a value between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
            }
        }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
        return "AlarmClock: snoozeInterval = " + getSnoozeInterval() + ", Repeat = " + getRepeat(); //call my own getter
        }


}

