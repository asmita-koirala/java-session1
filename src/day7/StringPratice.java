package day7;

import java.util.logging.Logger;

public class StringPratice {

    public static void main (String[] args){
        String name = "Asmita";

        String lowerCaseString = name.toUpperCase();
        Logger.getGlobal().info(lowerCaseString);

//        String stringsubname = name.substring();
//        Logger.getGlobal().info(subStringname);

//        String New = name.toUpperCase();
//        Logger.getGlobal().info(lowerCaseString);

        String one= "one";
        String anotherOne = "one";
        String differentOne= "one two".substring(0,3);

        Logger.getGlobal().info(String.valueOf(one == differentOne));
        Logger.getGlobal().info(String.valueOf(one.equals(differentOne)));

        String yes = "yes";
        String userYes = "Yes";
//        String lowercaseYes = userYes.toLowerCase();
        //equalIgnoreCase use
        Logger.getGlobal().info(String.valueOf("yes".equalsIgnoreCase(userYes)));





    }


}
