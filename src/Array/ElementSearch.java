package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ElementSearch {
    static int arraySize;
     static int userChoice;
    //static int[] arrayInput;

    public static void UserInput() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        arraySize = in.nextInt();
        int[] arrayDetails = new int[arraySize];
        //in.close();

        //Scanner arr = new Scanner(System.in);
        for( int i = 0; i < arraySize; i++){
            System.out.println("Enter the elements of the array" +i);
            arrayDetails[i] = in.nextInt();
            }
        //arr.close();
        System.out.println(Arrays.toString(arrayDetails));

        //Scanner u = new Scanner(System.in);
        System.out.println("Enter your choice" );
        userChoice = in.nextInt();
        boolean ak = false;

        for ( int i =0; i < arraySize-1; i++) {
            if (arrayDetails[i] == userChoice) {
                ak = true;
                System.out.println("The element" +userChoice + "is in index" + i);
            }


        } //end of for loop
        if(ak == false)
            System.out.println("not in the array");
        in.close();


        }



    }


