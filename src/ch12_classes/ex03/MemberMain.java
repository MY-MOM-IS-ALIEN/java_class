package ch12_classes.ex03;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        // bookService 클래스 객체 선언
        MemberService memberService = new MemberService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원 가입 | 2.로그인 | 3.회원 조회 | 4.회원정보 수정 | 5.회원 탈퇴 | 6.로그아웃 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();
            if (selectNo == 1) {
                // 호출하는 문장 작성
                memberService.join();
            } else if (selectNo == 2) {
                // 호출하는 문장 작성
                memberService.login();
            } else if (selectNo == 3) {
                // 호출하는 문장 작성
                memberService.findAll();
            } else if (selectNo == 4) {
                // 호출하는 문장 작성
                memberService.update();
            } else if (selectNo == 5) {
                // 호출하는 문장 작성
                memberService.resign();
            } else if (selectNo == 6) {
//            // 호출하는 문장 작성
                memberService.logout();
            }
        }
    }
}

