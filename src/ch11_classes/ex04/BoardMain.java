package ch11_classes.ex04;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        BoardService boardService = new BoardService();
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 7.데이터테스트 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();
            if (selectNo == 1) {
                // 호출하는 문장 작성
                boardService.Writing();
            } else if (selectNo == 2) {
                // 호출하는 문장 작성
                boardService.findAll();
            } else if (selectNo == 3) {
                // 호출하는 문장 작성
                boardService.findId();
            } else if (selectNo == 4) {
                // 호출하는 문장 작성
                boardService.update();
            } else if (selectNo == 5) {
                // 호출하는 문장 작성
                boardService.remove();
            } else if (selectNo == 6) {
//            // 호출하는 문장 작성
                boardService.seach();
            } else if (selectNo == 7) {
                boardService.testData();
            } else if (selectNo == 0) {
                run = false;
            }
        }
    }
}