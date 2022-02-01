package StudentManagementSystem;

import java.util.Scanner;

public class StudentDaoImpl {
        static StudentInfo studentsArray[] = new StudentInfo[2];
        static Scanner sc= new Scanner(System.in);

    public static void Register(){
        System.out.println("Enter Student ID");
        int sId = sc.nextInt();
        System.out.println(" Enter full name");
        String fullName = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter the password");
        String password = sc.next();

        StudentInfo studObj =  new StudentInfo(sId,fullName,email,password);
        studentsArray[0] = studObj;
        System.out.println("Student is registered Successfully");
    }
}
