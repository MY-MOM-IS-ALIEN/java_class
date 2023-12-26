package ch10_class.ex9;

public class Student {

    private String studentName;
    private int studentNumber;
    private String studentMajor;
    private String studentMoblie;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMoblie() {
        return studentMoblie;
    }

    public void setStudentMoblie(String studentMoblie) {
        this.studentMoblie = studentMoblie;
    }

    public Student(){

    }
    public Student(String studentName, int studentNumber, String studentMajor, String studentMoblie) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMoblie = studentMoblie;
    }

    public void print() {
        System.out.println("Student Name: " + this.getStudentName());
        System.out.println("Student Number: " + this.getStudentNumber());
        System.out.println("Student Major: " + this.getStudentMajor());
        System.out.println("Student Mobile: " + this.getStudentMoblie());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber=" + studentNumber +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMoblie='" + studentMoblie + '\'' +
                '}';
    }
}
