package ch11_classes.ex06.service;

import ch11_classes.ex06.CommonVariables;
import ch11_classes.ex06.DTO.BoardDTO;
import ch11_classes.ex06.DTO.CommentDTO;
import ch11_classes.ex06.repository.BoardRepository;
import ch11_classes.ex06.repository.CommentRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    CommentRepository commentRepository = new CommentRepository();
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
        for (BoardDTO boardDTO : boardDTOList) {
        System.out.println("글번호 : " + boardDTO.getId() + " | 글제목 : " + boardDTO.getBoardTitle() + " | 작성자 : " + boardDTO.getBoardWriter() + " | 작성시간 : " + boardDTO.getCreatedAt());
        }
    }

    public void findById() {
        System.out.println("찾을 글번호");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            System.out.println(boardDTO);
            System.out.println("******댓글******");
            List<CommentDTO> commentDTOList = commentRepository.commentList(id);
            if (commentDTOList.size() > 0) {
                for (CommentDTO commentDTO1 : commentDTOList) {
                    System.out.println("글번호 : " + commentDTO1.getId() + " | 작성자 : " + commentDTO1.getCommentWriter() + " | 내용 : " + commentDTO1.getCommentContents() + " | 작성시간 : " + commentDTO1.getCreatedAt());
                }
            } else {
                System.out.println("작성된 댓글이 없습니다.");
            }
            System.out.println("1.댓글작성 | 2.메뉴로 돌아가기");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.println("입력 : ");
                String comment = scanner.next();
                CommentDTO commentDTO = new CommentDTO(id, CommonVariables.loginId, comment);
                boolean commentDTO1 = commentRepository.comment(commentDTO);
                if (commentDTO1) {
                    System.out.println("작성 완료");
                } else {
                    System.out.println("작성 실패");
                }
            }
        } else {
            System.out.println("해당 글을 찾을 수 없습니다.");
        }
    }


    public void update() {
        System.out.println("수정할 글번호");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            if (!CommonVariables.loginId.equals(boardDTO.getBoardWriter())) {
                System.out.println("본인이 작성한 글만 수정 가능합니다.");
            } else {
                System.out.println("수정할 글제목");
                String boardTitle = scanner.next();
                System.out.println("수정할 글내용");
                String boardContents = scanner.next();
                boolean boardDTO1 = boardRepository.update(id, boardTitle, boardContents);
                if (boardDTO1) {
                    System.out.println("수정 완료");
                } else {
                    System.out.println("수정 실패");
                }
            }
        } else {
            System.out.println("해당 글을 찾을 수 없습니다.");
        }
    }

    public void delete() {
        System.out.println("삭제할 글번호");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            if (!CommonVariables.loginId.equals(boardDTO.getBoardWriter())) {
                System.out.println("본인이 작성한 글만 삭제 가능합니다.");
            } else {
                System.out.println("정말 삭제 하시겠습니까?");
                int selectNo = scanner.nextInt();
                if (selectNo == 1) {
                    boolean boardDTO1 = boardRepository.delete(id);
                    if (boardDTO1) {
                        System.out.println("삭제 완료");
                    } else {
                        System.out.println("삭제 실패");
                    }
                }
            }
        } else {
            System.out.println("해당 글을 찾을 수 없습니다.");
        }
    }

    public void findByTitle() {
        System.out.println("검색어 : ");
        String boardTitle = scanner.next();
        List<BoardDTO> boardDTO = boardRepository.findByTitle(boardTitle);
        if (boardDTO != null) {
            for (int i = 0; i < boardDTO.size(); i++) {
            }
            System.out.println(boardDTO);
        } else {
            System.out.println("검색내용이 없습니다.");
        }
    }
}
