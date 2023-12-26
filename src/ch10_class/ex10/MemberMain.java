package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        Member member = null; // 회원 정보를 저장할 Member 객체

        while (run) {
            System.out.println("-----------MENU------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.종료");
            System.out.println("---------------------------");
            System.out.println("메뉴를 선택하세요");
            int ans = scanner.nextInt();
            if (ans == 1) {
                System.out.println("사용할 Email을 입력하세요");
                String email = scanner.next();
                System.out.println("Password로 사용할 6자리의 숫자를 입력해주세요");
                String password = scanner.next();
                System.out.println("이름을 입력해주세요");
                String name = scanner.next();
                System.out.println("전화번호를 입력해주세요 예시) 010-xxxx-xxxx");
                String mobile = scanner.next();
                System.out.println("가입이 완료되었습니다. 로그인 해주세요.");

                member = new Member(email, password);
                member.setMemberName(name);
                member.setMemberMobile(mobile);
            } else if (ans == 2) {
                if (member != null) {
                    System.out.println("Email을 입력하세요");
                    String inputEmail = scanner.next();
                    System.out.println("Password를 입력하세요");
                    String inputPassword = scanner.next();

                    boolean result = member.memberLogin(inputEmail, inputPassword);
                    if (result) {
                        System.out.println("로그인 성공");
                    } else {
                        System.out.println("로그인 실패");
                    }
                } else {
                    System.out.println("가입된 회원 정보가 없습니다. 회원가입을 먼저 해주세요.");
                }
            } else if (ans == 3) {
                run = false;
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        scanner.close();
    }
}