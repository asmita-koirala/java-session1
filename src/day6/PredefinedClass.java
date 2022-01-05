package day6;

import java.util.logging.Logger;

public class PredefinedClass {
    public static void main(String[] args) {
        double randomNumber = Math.random() * 100;
        //System.out.println(randomNumber);
        Logger.getGlobal().info(String.valueOf(randomNumber));
        double a= 2.1;
        double ceilNumber = Math.ceil(a);
        double floorNumber = Math.floor(a);
        double roundNumber = Math.round(a);

        Logger.getGlobal().info(String.valueOf(randomNumber));
        Logger.getGlobal().info(String.valueOf(randomNumber));
        Logger.getGlobal().info(String.valueOf(randomNumber));

        }

    }

