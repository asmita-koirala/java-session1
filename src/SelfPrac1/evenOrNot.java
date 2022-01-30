package SelfPrac1;

import java.util.Scanner;

public class evenOrNot {
    public static void main(String[] args) {
        int number;
        // Fetch user input from the console
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        number = in.nextInt();
        //condition check even or not
        if (number % 2== 0) {
            System.out.println("The number is even: " + number);
        }
        else {
            System.out.println("The number is odd:" +number);
        }

        }
}
