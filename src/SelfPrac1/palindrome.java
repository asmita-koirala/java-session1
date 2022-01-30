package SelfPrac1;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = in.nextInt();
        int r, temp;
        int sum = 0;
        temp = userInput;

        while( userInput > 0){
            r= userInput % 10;
            sum = (sum *10)+ r;
            userInput = userInput/10;
        }
        if(sum == temp)
            System.out.println("It is a palindrome number");
        else
            System.out.println("It is not a palindrome number");

    }
}
