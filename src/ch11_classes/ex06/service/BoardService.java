package ch11_classes.ex06.service;

import ch11_classes.ex06.DTO.BoardDTO;
import ch11_classes.ex06.repository.BoardRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    public void newPost() {
        System.out.println("글제목 : ");
        String boardTitle = scanner.next();
        System.out.println("내용 : ");
        String boardContents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardContents);
        boolean boardDTO1 = boardRepository.newPost(boardDTO);
        if (boardDTO1) {
            System.out.println("작성 완료");
        } else {
            System.out.println("작성 실패");
        }
    }

    public void postList() {
        List<BoardDTO> boardDTOList = boardRepository.postList();
        for (int i = 0; i < boardDTOList.size(); i++) {
        }
        System.out.println("boardDTOList = " + boardDTOList);
    }

    public void findById() {
        System.out.println("찾을 글번호");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            System.out.println(boardDTO);
        } else {
            System.out.println("해당 글을 찾을 수 없습니다.");
        }
    }

    public void update() {

    }
}
