package StudentManagementSystem;

public class StudentInfo {
    private int studentId;
    private String fullName;
    private String email;
    private String password;

// while creating constructor name is same as class name
    //parameterized constructor

    public StudentInfo(int studentId, String fullName,String email, String password){
        this.studentId =  studentId;
        this.fullName = fullName;
        this.email = email;
        this.password= password;
    }
// Default constructor
    public StudentInfo(){
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
