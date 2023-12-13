package Ch10_class.ex9;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자 생성하여 setter로 필드값 채우기
        Student student = new Student();

        student.setStudentName("이름1");
        student.setStudentNumber(111111);
        student.setStudentMajor("사체과");
        student.setStudentMoblie("010-1111-1111");


// 모든 필드값에 매개변수를 담아 출력하기
        Student student1 = new Student("이름2", 222222, "유아교육", "010-2222-2222");
// print() 메서드를 생성하여 한번에 출력하기
        student.print();
        student1.print();
        System.out.println("student = " + student);
        System.out.println("student1 = " + student1);
    }
}

