package SelfPrac1;

public class evenumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int j = i % 2;
            if (j == 0)
                System.out.println("Even numbers" +" "+ i);

        }
    }
}

