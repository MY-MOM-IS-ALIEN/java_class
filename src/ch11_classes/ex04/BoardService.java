package ch11_classes.ex04;

import Ch10_class.ex11.Board;
import ch11_arrayList.ex3.Book;
import ch11_classes.ex03.MemberDTO;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    Scanner scanner = new Scanner(System.in);
    BoardRepository boardRepository = new BoardRepository();

    public void Writing() {
        System.out.print("제목 : ");
        String boardTitle = scanner.next();
        System.out.print("작성자명 : ");
        String boardWriter = scanner.next();
        System.out.print("내용 : ");
        String boardContents = scanner.next();
        System.out.print("비밀번호 : ");
        Long boardPass = scanner.nextLong();

        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents, boardPass);
        boolean result = boardRepository.Writing(boardDTO);
        if (result) {
            System.out.println("작성 완료");
            System.out.println(boardDTO);
        } else {
            System.out.println("오류, 다시 작성해주세요");
        }
    }

    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();

        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("글번호 : " + boardDTO.getId() + " 제목 : " + boardDTO.getBoardTitle() + " 작성자 : " + boardDTO.getBoardWriter() + " 내용 : " + boardDTO.getBoardContents());
        }
    }

    public void findId() {
        System.out.print("조회할 글번호 입력 : ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findId(id);

        System.out.println("boardDTO = " + boardDTO);
    }

    public void update() {
        System.out.println("수정할 글번호 : ");
        Long id = scanner.nextLong();
        System.out.println("비밀번호 입력 : ");
        Long password = scanner.nextLong();
        boolean boardDTO = boardRepository.check(id, password);
        if (boardDTO) {
            System.out.println("수정할 제목");
            String updateTitle = scanner.next();
            System.out.println("수정할 내용");
            String updateContents = scanner.next();

            boolean boardDTO1 = boardRepository.update(id, updateTitle, updateContents);
            if (boardDTO1) {
                System.out.println("수정 완료");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");

        }
    }

    public void remove() {
        System.out.println("삭제할 글번호 : ");
        Long id = scanner.nextLong();
        System.out.println("비밀번호 입력 : ");
        Long password = scanner.nextLong();

        boolean boardDTO = boardRepository.remove(id, password);
        if (boardDTO) {
            System.out.println("삭제 완료");
        } else {
            System.out.println("삭제 실패 , id 또는 비밀번호를 확인하세요");
        }
    }

    public void seach() {
        System.out.println("검색어 : ");
        String result = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.seach(result);

        if (result != null) {
            for (int i = 0; i < boardDTOList.size(); i++) {
                System.out.println("boardDTO = " + boardDTOList);
            }
        } else {
            System.out.println("검색 내용이 없습니다.");
        }
    }
}