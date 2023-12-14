package ch12_classes;

import Ch10_class.ex4.Student;

public class StudentSevice {
    /**
     * method name : method1
     * parameter X
     * return X
     */
    StudentRepository studentRepository = new StudentRepository();

    public void method1() {
        System.out.println("StudentSevice.method1");
        // Repository의 method1을 호출
        studentRepository.method1();
    }

    public void method2() {
        System.out.println("StudentSevice.method2");
        String str1 = "집에 가고 싶다";
        studentRepository.method2(str1);
    }

    public void method3() {
        System.out.println("StudentSevice.method3");
    }


}
