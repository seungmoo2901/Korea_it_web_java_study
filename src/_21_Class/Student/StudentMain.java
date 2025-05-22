package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "이승무";
        student.age = 26;
        student.email = "lsm290225@naver.com";
        student.address = "김해시...";

        student.showInfo();
    }
}
