package Array;

public class ArrayAverage {
    public static void main(String[] args) {
        int [] myList = {1,2,3,4};
        double total;
        total = 0;
        for (int i = 0; i < myList.length; i++) {
            total  = myList[i] + total;
        }
        System.out.println("Total is " + total);
        double avg = (total / 4.0);
        System.out.println("Average is " + avg);
    }
}