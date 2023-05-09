/*
 * Client-side main class to create a few instances of television and give them a test drive
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();

        //Create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand ("Samsung");
        tv1.setVolume(Television.MIN_VOLUME);

        //Turn tv1 on and off
        tv1.turnOn();
        tv1.turnOff();

        // Create a second instance of Television and set its properties
        Television tv2 = new Television("Lg", Television.MAX_VOLUME);

        //Turn tv2 on and off
        tv2.turnOn();
        tv2.turnOff();

        //Create a third instance of Television and set its properties
        Television tv3 = new Television("Toshiba", 50);

        //Turn tv3 on and off
        tv3.turnOn();
        tv3.turnOff();

        System.out.println(tv1); //automatically called
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();
    }

}