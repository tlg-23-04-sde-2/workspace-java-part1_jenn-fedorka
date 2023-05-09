package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {

        Television tv = new Television("Samsung", 32);
        tv.setVolume(0);
        System.out.println(tv);

        tv.setVolume(100);
        System.out.println(tv);

        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println(tv);

        Television tv1 = new Television("Samsung", 32);
        System.out.println(tv1);

        tv.setBrand("Samsung");
        System.out.println((tv));

        tv.setBrand("LG");
        System.out.println(tv);

        tv.setBrand("Sony");
        System.out.println(tv);

        tv.setBrand("Toshiba");
        System.out.println(tv);

        tv.setBrand("INVALID");
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.setVolume(50);
        System.out.println(tv);
    }


}