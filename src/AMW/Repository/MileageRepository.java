package AMW.Repository;

import AMW.Commonvariables;
import AMW.DTO.MemberDTO;
import AMW.DTO.MileageDTO;

import java.util.ArrayList;
import java.util.List;

public class MileageRepository {
    MemberRepository memberRepository = new MemberRepository();
    List<MemberDTO> memberDTOList = new ArrayList<>();

    public List<MemberDTO> memberCheck() {
        List<MemberDTO> memberDTOList = memberRepository.memberCheck();
        return memberDTOList;
    }

    public MemberDTO amount(String loginId, long amount) {
        MemberDTO memberDTO1 = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginId.equals(memberDTOList.get(i).getMemberEmail())) {
                long memberDTO = memberDTOList.get(i).getBalance();
                memberDTO = memberDTO + amount;
                memberDTOList.get(i).setBalance(memberDTO);
                memberDTO1 = memberDTOList.get(i);
                break;
            }
        }
        return memberDTO1;
    }
}
