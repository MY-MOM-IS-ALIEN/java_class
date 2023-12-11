package Ch10_class.ex5;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "이름1";
        student1.studentNumber = "15학번";
        student1.studentMobile = "010-1111-1111";
        System.out.println("student1.studentName = " + student1.studentName + "student1.studentNumber = " + student1.studentNumber + "student1.studentMobile = " + student1.studentMobile);


        Student student2 = new Student("이름2","15학번","010-2222-2222");{
            System.out.println("student2.studentName = " + student2.studentName+"student2.studentNumber = " + student2.studentNumber+"studentMobile = " + student2.studentMobile);
        }

    }
}
