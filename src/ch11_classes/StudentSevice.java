package ch11_classes;

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

    /**
     * StudentDTO 객체를 생성하고
     * Repository 의 method3로 DTO객체를 전달함
     */
    public void method3() {
        StudentDTO studentDTO = new StudentDTO("안민우", "11111", "데이터사이언티스트", "010-1111-1111");
        studentRepository.method3(studentDTO);
        System.out.println(studentRepository.method3(studentDTO));
    }


}
