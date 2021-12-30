package day3;

public class functionReturn {

    public static void main(String[] args) {
        int a = 70;
        int b = 22;
        int d = 32;
        int result1 = addition(a, b);
        int sum = result1 + d;
        System.out.println(sum);
    }

    public static int addition(int x , int y){
        int z = x + y;
        System.out.println(z);
        return z;
    }


}
