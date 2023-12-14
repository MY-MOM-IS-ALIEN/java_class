package AMW;

import Ch10_class.ex11.Board;

import java.util.Scanner;

public class boardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Board board = null;

        while (run) {
            System.out.println("--------------------------");
            System.out.println("1.글쓰기 | 2.글조회 | 3.종료");
            System.out.println("--------------------------");
            System.out.println("메뉴를 선택해주세요");
            selectNo = scanner.nextInt();

            if(selectNo == 1){
                System.out.println("글번호 입력");
                Long boardId = scanner.nextLong();
                scanner.nextLine();// 개행문자 정리
                System.out.println("글제목 입력");
                String boardTitle = scanner.nextLine();
                System.out.println("글쓴이 입력");
                String boardWrite = scanner.nextLine();
                System.out.println("글내용 입력");
                String boardContents = scanner.nextLine();

                board = new Board(boardId,boardTitle,boardWrite,boardContents);
                board.setBoardId(boardId);
                board.setBoardTitle(boardTitle);
                board.setBoardWriter(boardWrite);
                board.setBoardContents(boardContents);
            } else if (selectNo == 2) {
                System.out.println("찾는 글번호 입력");
                Long selectNo1 = scanner.nextLong();
                board.findById(selectNo1);

            }

        }
    }
}
