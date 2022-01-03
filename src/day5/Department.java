package day5;

public class Department {

    private String deptName;
    private String nameOfTeachers;
    private String nameOfCourses;
    private int numberOfStudents;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getNameOfTeachers() {
        return nameOfTeachers;
    }

    public void setNameOfTeachers(String nameOfTeachers) {
        this.nameOfTeachers = nameOfTeachers;
    }

    public String getNameOfCourses() {
        return nameOfCourses;
    }

    public void setNameOfCourses(String nameOfCourses) {
        this.nameOfCourses = nameOfCourses;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
