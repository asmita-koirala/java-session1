package Array;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOfElement {
    static int arraySize;
    static int userChoice;

    public static void getInput(){

        Scanner in= new Scanner( System.in);
        System.out.println("Enter the array size" );
        arraySize = in.nextInt();
        int[] arrayContent = new int[arraySize];


        for (int i = 0; i <arraySize ; i++) {
            System.out.println("Enter array details " + i);
            arrayContent[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arrayContent));
        userChoice = in.nextInt();

        for(int i = 0; i< arraySize; i++){
            if (userChoice == arrayContent[i])
                System.out.println("The index of the element is" + i);
            else
                System.out.println("Element not found");
            }
        }

    }



