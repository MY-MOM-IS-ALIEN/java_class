package AMW;

public class Student {
    private String studentName;
    private int studentNumber;
    private String studentMajor;
    private String studentMoblie;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public void setStudentMoblie(String studentMoblie) {
        this.studentMoblie = studentMoblie;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public String getStudentMoblie() {
        return studentMoblie;
    }

    public Student(){

    }
    public Student(String studentName,int studentNumber,String studentMajor,String studentMoblie){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMoblie = studentMoblie;
    }
    public void print(){
        System.out.println("studentName = " + studentName);
        System.out.println("studentNumber = " + studentNumber);
        System.out.println("studentMajor = " + studentMajor);
        System.out.println("studentMoblie = " + studentMoblie);
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }


}

