package day2;

public class Student {
    // states- declare variables
    // name
    // phoneNumber
    // dob
    // class
    // rollNumber
    // height
    // address
    // idNumber
    // email
    // username
    // password
    // emergencyContactNumber
    // socialSecurityNumber

    String name;
    String phoneNumber;
    String dob;
    String sClass;
    private String rollNumber;
    float height;
    String address;
    String idNumber;
    String email;
    protected String username;
    String password;
    String emergencyContactNumber;
    String socialSecurityNumber;


    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Ram";


        Student student2 = new Student();
        student2.name = "Asmi";

        System.out.println(student1.name);
        System.out.println(student1.rollNumber);


    }


}

// behaviour

// present
// studying
// playing
// working
// teaching
// discussing
// eating
