package day5;

public class PolymorphismPractice {

    public static int addition( int a , int b){
        return a + b;
    }
    public static float addition (float a, float b , float c ){
        return a + b + c;
    }

    public static void main(String[] args) {
        //PolymorphismPractice number= new PolymorphismPractice();
        System.out.println(PolymorphismPractice.addition(20, 20));
        System.out.println(PolymorphismPractice.addition((float) 2.02,(float) 4.0, (float) 4.0));

    }
}


