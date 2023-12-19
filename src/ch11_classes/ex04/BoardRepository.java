package ch11_classes.ex04;

import ch11_classes.ex02.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean Writing(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardDTOList;
    }

    public BoardDTO findId(Long id) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()))
            boardDTO = boardDTOList.get(i);
        }
        return boardDTO;
    }

    public boolean check(Long id, Long password) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && password.equals(boardDTOList.get(i).getBoardPass())) ;
            result = true;
        }
        return result;
    }

    public boolean update(Long id, String updateTitle, String updateContents) {
        boolean boardDTO = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).setBoardTitle(updateTitle);
                boardDTOList.get(i).setBoardContents(updateContents);
                boardDTO = true;
            }
        }
        return boardDTO;
    }

    public boolean remove(Long id, Long password) {
        boolean boardDTO = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && password.equals(boardDTOList.get(i).getBoardPass())) {
                boardDTOList.remove(i);
                boardDTO = true;
            } else {
                return false;
            }
        }
        return boardDTO;
    }

    public List<BoardDTO> seach(String result) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            // 저장되어 있는 도서명에 검색어가 포함되어 있으면 true
            if (boardDTOList.get(i).getBoardTitle().contains(result)) {

                BoardDTO boardDTO = boardDTOList.get(i);
                boardDTOS.add(boardDTO);
            }
        }
        return boardDTOS;
    }
}
