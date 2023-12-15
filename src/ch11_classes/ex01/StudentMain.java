package ch11_classes.ex01;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        // StudentService 클래스 객체 선언
        StudentSevice studentSevice = new StudentSevice();


        while (run) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1.method1 호출 | " + "2.method2 호출 | " + "3.method3 호출 | " + "4.method4 호출 | " + "5.method5 호출");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("선택 : ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.println("메서드 호출 전");
                studentSevice.method1();
                System.out.println("메서드 호출 후");
            } else if (selectNo == 2) {
                studentSevice.method2();
            } else if (selectNo == 3) {
                studentSevice.method3();
            } else if (selectNo == 4) {
                studentSevice.method4();
            } else if (selectNo == 5) {
                studentSevice.method5();
            }
        }
    }
}
