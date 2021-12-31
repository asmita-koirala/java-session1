package day4;

public class EncapsulationPractice {

    public static void main(String[] args){
        Student student1 = new Student();
        student1.setName("Ram");
        student1.setSocialSecurityNumber("123456");

        Student student2 = new Student();
        student2.setName("Sita");

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        //System.out.println(student1.getSocialSecurityNumber());
    }



}
