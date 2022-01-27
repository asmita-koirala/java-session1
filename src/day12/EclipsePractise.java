package day12;

import java.util.logging.Logger;

//import java.util.logging.Logger;
public class EclipsePractise {
    public static void main(String[] args) {
        add(2,3);
        add(2,3,5);
        add(2,4,6,8);

        //System.out.printf("%d, %d, %d", 3,2,5);
    }

    public static void add(int... values){
        int temp = 0;
        for (int value: values){
            temp += value;
        }
        Logger.getGlobal().info(String.valueOf(temp));
    }

}
