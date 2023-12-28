package AMW.Repository;

import AMW.Commonvariables;
import AMW.DTO.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO>memberDTOList = new ArrayList<>();
    public boolean check(String memberEmail) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberEmail.equals(memberDTOList.get(i).getMemberEmail())){
                return false;
            }
        }
        return true;
    }


    public boolean save(MemberDTO memberDTO1) {
        return memberDTOList.add(memberDTO1);
    }

    public boolean login(String memberEmail, String memberPassword) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
                return true;
            }
        }return false;
    }

    public boolean update(String memberMobile) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(Commonvariables.loginEmail.equals(memberDTOList.get(i).getMemberEmail())){
                memberDTOList.get(i).setMemberMobile(memberMobile);
                return true;
            }
        }return false;
    }

    public boolean delete(String memberPassword) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
                memberDTOList.remove(i);
                return true;
            }
        }return false;
    }
}
