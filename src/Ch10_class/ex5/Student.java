package Ch10_class.ex5;

public class Student {
    String studentName;
    String studentNumber;
    String studentMobile;

    //기본생성자
    public Student(){

    }
    //매개변수 생성자
    public Student(String studentName,String studentNumber,String studentMobile){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMobile = studentMobile;
    }

}
