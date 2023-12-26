package ch12_classes.ex04;

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
        String boardPass = scanner.next();

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
        listPrint(boardDTOList);
    }

    public void findId() {
        System.out.print("조회할 글번호 입력 : ");
        Long id = scanner.nextLong();
        boolean boardDTO1 = boardRepository.HitsUp(id);
        if (boardDTO1) {
            BoardDTO boardDTO = boardRepository.findId(id);
            if (boardDTO != null) {
                System.out.println("boardDTO = " + boardDTO);
            } else {
                System.out.println("조회된 정보가 없습니다.");
            }
        }
    }

    public void update() {
        System.out.print("수정할 id: ");
        Long id = scanner.nextLong();
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = boardRepository.findId(id);
        // 게시글 있는지 확인
        if (boardDTO != null) {
            // 비밀번호 검증
            if (boardPass.equals(boardDTO.getBoardPass())) {
                // 비밀번호가 맞으면 수정할 제목, 내용 입력받고 수정처리
                System.out.print("수정 제목: ");
                String boardTitle = scanner.next();
                System.out.print("수정 내용: ");
                String boardContents = scanner.next();
                boolean result = boardRepository.update(id, boardTitle, boardContents);
                if (result) {
                    System.out.println("수정 완료");
                } else {
                    System.out.println("수정 실패");
                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다!");
            }
        } else {
            System.out.println("요청하신 게시글은 존재하지 않습니다!");
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
                listPrint(boardDTOList);
            }
        } else {
            System.out.println("검색 내용이 없습니다.");
        }
    }

    //목록 출력전용 메서드
    // findAll , search 메서드로 부터 List 데이터를 전달 받아서 출력을 하는 메서드
    // Refactoring(리팩터링) : 정리정돈 , 효율적인 유지보수 가능
    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t" + "date\t");
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("글번호 : " + boardDTO.getId() + " 제목 : " + boardDTO.getBoardTitle() + " 작성자 : " + boardDTO.getBoardWriter() +
                    " 내용 : " + boardDTO.getBoardContents() + "\t" + boardDTO.getCreatedAt());
        }
    }
    public void testData(){
        for (int i = 0; i < 11; i++) {
            BoardDTO boardDTO = new BoardDTO("title" + i, "writer" + i, "contents" + i, "1234" + i);
            boardRepository.Writing(boardDTO);
        }
    }
}
