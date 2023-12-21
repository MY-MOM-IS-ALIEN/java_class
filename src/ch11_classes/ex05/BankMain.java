package ch11_classes.ex05;

import ch11_classes.ex04.BoardService;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.계좌가입 | 2.잔액조회 | 3.입금 | 4.출금 | 5.내역조회 | 6.계좌이체 | 7.데이터테스트 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();
            if (selectNo == 1) {
                // 호출하는 문장 작성
                bankService.join();
            } else if (selectNo == 2) {
                // 호출하는 문장 작성
                bankService.accountCheck();
            } else if (selectNo == 3) {
                // 호출하는 문장 작성
                bankService.deposit();
            } else if (selectNo == 4) {
                // 호출하는 문장 작성
                bankService.withdraw();
            } else if (selectNo == 5) {
//                 호출하는 문장 작성
                bankService.history();
            } else if (selectNo == 6) {
////            // 호출하는 문장 작성
                bankService.transfer();
//            } else if (selectNo == 7) {
//                bankService.testData();
            } else if (selectNo == 0) {
                run = false;
            }
        }
    }
}
