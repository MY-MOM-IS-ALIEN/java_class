package ch11_classes.ex06.repository;

import ch11_classes.ex06.DTO.BoardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO>boardDTOList = new ArrayList<>();
    public boolean newPost(BoardDTO boardDTO){
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> postList(){
        return boardDTOList;
    }
    public BoardDTO findById(){

    }
}
