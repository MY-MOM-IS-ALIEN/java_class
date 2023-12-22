package ch11_classes.ex06.repository;

import ch11_classes.ex06.CommonVariables;
import ch11_classes.ex06.DTO.BoardDTO;
import ch11_classes.ex06.DTO.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private static List<CommentDTO>commentDTOList = new ArrayList<>();

    public boolean comment(CommentDTO commentDTO){

        return commentDTOList.add(commentDTO);
        }


    public List<CommentDTO> commentList(Long id){
        List<CommentDTO>commentDTOList1 = new ArrayList<>();
        for (int i = 0; i < commentDTOList.size(); i++) {
            if(id.equals(commentDTOList.get(i).getBoardId())){
                commentDTOList1.add(commentDTOList.get(i));
            }
        }return commentDTOList1;
    }
}
