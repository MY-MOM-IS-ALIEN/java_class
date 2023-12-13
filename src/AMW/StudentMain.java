package AMW;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        student.setStudentName("이름1");
        student.setStudentNumber(11111);
        student.setStudentMajor("유교과");
        student.setStudentMoblie("010-1111-1111");

Student student1 = new Student("이름2",22222,"사체과","010-2222-2222");
int result = Student.sum(num1,num2);
        System.out.println("result = " + result);

student.print();

student1.print();
    }
}
