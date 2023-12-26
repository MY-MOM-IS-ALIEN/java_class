package ch12_classes.ex06.repository;

import ch12_classes.ex06.CommonVariables;
import ch12_classes.ex06.DTO.MemberDTO;

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

    public boolean login(String memberEmail, String memberPassword) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                CommonVariables.loginId = memberEmail;
                return true;
            }
        }
        return false;
    }

    public List<MemberDTO> list() {
        return memberDTOList;
    }

    public boolean update(String memberMobile) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (CommonVariables.loginId != null && CommonVariables.loginId.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(memberMobile);

            }
        }return true;
    }
    public boolean checkPass(String memberPassword){
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
                return true;
            }
        }return false;
    }
    public boolean resign(String memberPassword){
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
                memberDTOList.remove(i);
                return true;
            }
        }return false;
    }
}


