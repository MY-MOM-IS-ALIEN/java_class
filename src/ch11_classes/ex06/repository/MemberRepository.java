package ch11_classes.ex06.repository;

import ch11_classes.ex06.DTO.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();

    public MemberDTO check(String memberEmail) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    public boolean join(MemberDTO memberDTO1) {
return memberDTOList.add(memberDTO1);
    }
}


