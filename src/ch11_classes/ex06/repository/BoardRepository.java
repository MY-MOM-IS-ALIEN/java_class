package ch11_classes.ex06.repository;

import ch11_classes.ex06.CommonVariables;
import ch11_classes.ex06.DTO.BoardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean newPost(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> postList() {
        return boardDTOList;
    }

    public BoardDTO findById(Long id) {
        int result;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                int boardDTO = boardDTOList.get(i).getBoardHits();
                result = boardDTO + 1;
                boardDTOList.get(i).setBoardHits(result);
                for (int j = 0; j < boardDTOList.size(); j++) {
                    if (id.equals(boardDTOList.get(i).getId())) {
                        BoardDTO boardDTO1 = boardDTOList.get(i);
                        return boardDTO1;
                    }
                }
            }
        }
        return null;
    }

    public boolean update(Long id, String boardTitle, String boardContents) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                if (CommonVariables.loginId.equals(boardDTOList.get(i).getBoardWriter())) {
                    boardDTOList.get(i).setBoardTitle(boardTitle);
                    boardDTOList.get(i).setBoardContents(boardContents);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean delete(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                if (CommonVariables.loginId.equals(boardDTOList.get(i).getBoardWriter())) {
                    boardDTOList.remove(i);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public List<BoardDTO> findByTitle(String boardTitle) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(boardTitle)) {
                BoardDTO boardDTO = boardDTOList.get(i);
                boardDTOS.add(boardDTO);
            }
        }
        return boardDTOS;
    }
}
