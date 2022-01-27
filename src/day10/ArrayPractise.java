package day10;

import day4.Account;

import java.util.logging.Logger;

public class ArrayPractise {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4};
        String[] names = {"Asmi", "ram", "sita"};
        Account[]  bofa ={ new Account(), new Account()};

//Initialize the size of the array
        int [] a =new int[5];
        int[] updatedArray = new int[4];
        Account[] bofaccounts = new Account[3];

        a[0] = 9;
        a[1] = 4;
        a[4] = 2;

        int zeroPosition = a[0];
        Logger.getGlobal().info(String.valueOf(zeroPosition));


    }
}
