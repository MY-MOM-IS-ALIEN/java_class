package ch13_map.Ex03;

import ch13_map.Ex02.BookDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();
    private static String loginEmail = null;


    public boolean emailCheck(String memberEmail) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                return false;
            }
        }
        return true;
    }


    public boolean join(MemberDTO memberDTO) {
//        memberDTOMap.put(MemberDTO.getId(), memberDTO);
        return true;
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        MemberDTO memberDTO = null;
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail()) && memberPassword.equals(memberDTOMap.get(i).getMemberPassword())) {
                memberDTO = memberDTOMap.get(i);
                loginEmail = memberEmail;
            }
        }
        return memberDTO;
    }

    public Map<Long, MemberDTO> findAll() {
        return memberDTOMap;
    }

    public boolean update(String memberMobile) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberMobile.equals(memberDTOMap.get(i).getMemberMobile())) {
                memberDTOMap.get(i).setMemberMobile(memberMobile);
            }
        }
        return true;
    }

    public boolean resign(String memberPassword) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberPassword.equals(memberDTOMap.get(i).getMemberPassword())) {
                memberDTOMap.remove(i);
            }
        }
        return true;
    }
}
