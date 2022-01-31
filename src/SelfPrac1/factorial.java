package SelfPrac1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num;
        int fac= 1;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        num = in.nextInt();

        while(num > 1){
            fac = fac *num;
            num = num -1;
        }
        System.out.println("factorial is:" +fac);
    }
}
