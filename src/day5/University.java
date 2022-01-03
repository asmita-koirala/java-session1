package day5;

import day2.Student;

public class University {

    public static void main(String[] args){
        Department department1 = new Department();
        department1.setDeptName("Computer Science");
        department1.setNameOfTeachers("Avery");
        department1.setNameOfCourses("web backend");
        department1.setNumberOfStudents(36);

        Teacher teacher1 = new Teacher();
        teacher1.setSubject("Database");

        Students student1= new Students();
        student1.setNameOfStudent("Asmita");


    }
}
