package AMW;

import AMW.Service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원정보수정 | 4.회원탈퇴 | 5.로그아웃 | 6.항공권 메뉴");
            System.out.println("------------------------------------------------------------------------");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                memberService.save();
            } else if (selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3) {
                memberService.update();
            } else if (selectNo == 4) {
                memberService.delete();
            } else if (selectNo == 5) {
                memberService.logout();
            } else if (selectNo == 6){
                memberService.airline();
            }
        }
    }
}
