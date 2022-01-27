package day11;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayListPractise {

    public static void main( String[] args){
        ArrayList<String> users = new ArrayList<>(4);
        users.add("1asmi");
        users.add("neetu");
        users.add("2ganesh");

        Logger.getGlobal().info(users.toString());

        users.add(2, "3shanta");
        Logger.getGlobal().info(users.toString());

        users.set(2, "jeeva");
        Logger.getGlobal().info(users.toString());

        ArrayList<String> usersCopy = new ArrayList<>();
        usersCopy.addAll(users);
        Logger.getGlobal().info(users.toString());

        users.remove(1);
        Logger.getGlobal().info(users.toString());
    }

}
