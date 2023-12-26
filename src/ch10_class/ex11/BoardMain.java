package ch10_class.ex11;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Board board = null;

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 처리

            if (selectNo == 1) {
                System.out.println("글번호 입력");
                Long boardId = scanner.nextLong();
                scanner.nextLine(); // 개행 문자 처리
                System.out.println("글제목 입력");
                String boardTitle = scanner.nextLine();
                System.out.println("작성자 입력");
                String boardWriter = scanner.nextLine();
                System.out.println("내용 입력");
                String boardContents = scanner.nextLine();

                board = new Board(boardId, boardTitle, boardWriter, boardContents);
                board.setBoardId(boardId);
                board.setBoardTitle(boardTitle);
                board.setBoardWriter(boardWriter);
                board.setBoardContents(boardContents);

            } else if (selectNo == 2) {
                System.out.println("조회할 글번호 입력");
                Long contents = scanner.nextLong();
                scanner.nextLine(); // 개행 문자 처리
                board.findById(contents);

            } else if (selectNo == 3) {
                run = false;
            }
        }
    }
}