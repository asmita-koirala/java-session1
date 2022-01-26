package day9;

import java.util.Scanner;
import java.util.logging.Logger;

public class SwitchCasePractise {

    public static void main(String[] args) {
        Scanner myDay = new Scanner(System.in);
        Logger.getGlobal().info("Enter  day");

        String userChoice = myDay.nextLine();
        Logger.getGlobal().info("Users choice is " +userChoice);

        switch (userChoice){
            case "saturday","sunday" -> Logger.getGlobal().info("weekend");
            case "monday","tuesday", "wednesday", "Thursday", "friday" ->Logger.getGlobal().info(" working days");
            default -> Logger.getGlobal().info("No any match");
        }
    }



}
