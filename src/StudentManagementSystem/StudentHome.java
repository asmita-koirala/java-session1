package StudentManagementSystem;

import java.util.Scanner;

public class StudentHome {
    public static void main(String[] args) {
        StudentDaoImpl sd = new StudentDaoImpl();
        boolean flag = true;
        while(flag) {
            System.out.println("********* 1) Register **********");
            System.out.println("********* 2) Exit **********");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == 1) {
                StudentDaoImpl.Register();
            } else {
                System.out.println("please register first");
            }
        }

    }

}
