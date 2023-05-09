package dont.wakeme;

/*
 * This is a client "main class". i.e. a class definition with the main() method.
 * It will create a few instances of an alarm clock and give them a basic test-drive.
 */
class AlarmClockClient {

    // starting point or entry point for every standalone Java application
    public static void main(String[] args) {
        //Create an instance of AlarmClock (AlarmClock object) and set its properties
        AlarmClock clock1 = new AlarmClock(7,5);

        //Create a second instance of AlarmClock and set its properties
        AlarmClock clock2 = new AlarmClock(10);

        //create a third instance of AlarmClock but do not set its properties
        AlarmClock clock3 = new AlarmClock();
        clock3.setSnoozeInterval(AlarmClock.MAX_INTERVAL);

        // Make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        //Show their toString() methods in action
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);  //toString automatically gets called
    }
}