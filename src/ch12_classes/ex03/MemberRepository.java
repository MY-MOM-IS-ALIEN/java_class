package ch12_classes.ex03;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private static String loginEmail = null;
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberEmail.equals(memberDTOList.get(i).getMemberEmail())){
                // 중복되는 이메일이 있다 > 결과를 false로 줌
                result = false;
            }
        }
        return result;
    }

    public boolean join(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberEmail.equals(memberDTO.getMemberEmail()) && memberPassword.equals(memberDTO.getMemberPassword())) {
                loginEmail = memberEmail;
               return memberDTO;
            }
        }
        return null;
    }

    public List<MemberDTO> findAll(){
        return memberDTOList;
    }
    public boolean update(String memberMobile){
        boolean memberDTO = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(loginEmail.equals(memberDTOList.get(i).getMemberEmail())){
                memberDTOList.get(i).setMemberMobile(memberMobile);
                memberDTO = true;
            }
        }
        return memberDTO;
    }
    public boolean resign(String memberPassword){
        boolean memberDTO = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
                memberDTOList.remove(i);
                memberDTO = true;
            }
        }
        return memberDTO;
    }


}
