package ch07_while;

import java.util.Scanner;

public class Ex08_whileEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int save = 0;

        System.out.println("*******************************************************************************");
        System.out.println("검찰 또는 경찰을 사칭하며 금전거래를 요청한 전화를 받고 계신다면 1번 아니면 2번을 눌러주세요");
        System.out.println("*******************************************************************************");
        System.out.print("선택> ");
        int voice = scanner.nextInt();
        if (voice == 1) {
            System.out.println("거래가 종료 되었습니다 창구직원과 상담하세요.");
            run = false;
        } else {
            while (run) {
                System.out.println("-------------------------------");
                System.out.println("1.예금 | " + "2.출금 | " + "3.잔고 | " + "4.종료");
                System.out.println("-------------------------------");
                System.out.print("선택> ");
                int ans = scanner.nextInt();
                if (ans == 1) {
                    System.out.print("예금하실 금액>");
                    int ans2 = scanner.nextInt();
                    save = save + ans2;
                    System.out.println("입금 후 현재잔액은 " + save + "원 입니다.");
                } else if (ans == 2) {
                    System.out.print("출금하실 금액(만원 단위로 입력해주세요): ");
                    int ans3 = scanner.nextInt();
                    if (ans3 % 10000 != 0) {
                        System.out.println("만원 단위로 입력해주세요.");
                    } else if (save < ans3) {
                        System.out.println("잔액이 부족합니다.");
                        System.out.println("현재잔액은 " + save + "원 입니다.");
                    } else {
                        save = save - ans3;
                        System.out.println("출금 후 현재잔액은 " + save + "원 입니다.");
                    }
                } else if (ans == 3) {
                    System.out.println("현재잔액은 " + save + "원 입니다.");
                } else if (ans == 4) {
                    System.out.println("거래가 종료되었습니다 카드 또는 통장을 챙겨주세요.");
                    System.out.println("감사합니다.");
                    run = false;
                }


            }
        }
    }
}
