package ch12_classes.ex06;

import ch12_classes.ex06.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------메인메뉴-----------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.println("----------------------------------------------------------------------------------------");
            int selectNo = scanner.nextInt();
            if(selectNo == 1){
                memberService.join();
            } else if (selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3) {
                memberService.list();
            } else if (selectNo == 4) {
                memberService.update();
            } else if (selectNo == 5) {
                memberService.resign();
            } else if (selectNo == 6) {
                memberService.logout();
            } else if (selectNo == 7) {
                memberService.board();
            } else if (selectNo == 0) {
                run = false;
            }
        }
    }
}
