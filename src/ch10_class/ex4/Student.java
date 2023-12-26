package ch10_class.ex4;

public class Student {
    // 이름 , 학번 , 학과 필드
    String studentName;
    String studentNumber;
    String studentMajor;

    // 기본생성자
     public Student(){

     }
    // 이름, 학번 , 학과를 매개변수로 하는 생성자
    public Student(String studentName,String studentNumber,String studentMajor){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
    }
}
