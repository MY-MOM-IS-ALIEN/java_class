package ch11_array.ex2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student(1L, "학생1", "11111", "국문과", "010-1111-1111");
        studentList.add(student1);

        Student student2 = new Student(2L, "학생2", "22222", "독일어", "010-2222-2222");
        studentList.add(student2);
        System.out.println(studentList.get(0));
        System.out.println(studentList.get(1));

        Student a = studentList.get(0);
        System.out.println("a = " + a);

        //1번 인덱스에 담긴 객체의 학과만 출력
        System.out.println(studentList.get(1).getStudentMajor());


        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getSudentName());
        }
    }

}
