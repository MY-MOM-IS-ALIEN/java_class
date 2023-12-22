package ch11_classes.ex06.repository;

import ch11_classes.ex06.CommonVariables;
import ch11_classes.ex06.DTO.BoardDTO;
import ch11_classes.ex06.DTO.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    List<CommentDTO>commentDTOList = new ArrayList<>();

    public boolean comment(Long id,String comment){
        CommentDTO commentDTO = new CommentDTO(id,CommonVariables.loginId,comment);
        return commentDTOList.add(commentDTO);
        }


    public CommentDTO commentList(Long id){

        for (int i = 0; i < commentDTOList.size(); i++) {
            if(id.equals(commentDTOList.get(i).getBoardId())){
                  CommentDTO commentDTO = commentDTOList.get(i);
                  return commentDTO;
            }
        }return null;
    }
}
