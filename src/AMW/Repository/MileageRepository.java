package AMW.Repository;

import AMW.Commonvariables;
import AMW.DTO.MemberDTO;
import AMW.DTO.MileageDTO;

import java.util.ArrayList;
import java.util.List;

public class MileageRepository {
    MemberRepository memberRepository = new MemberRepository();
    List<MileageDTO>mileageDTOList = new ArrayList<>();

    public MileageDTO amount(String loginId, long amount) {
        MileageDTO memberDTO1 = null; // 반복문 밖에서 MemberDTO 변수를 초기화
        for (int i = 0; i < MemberRepository.memberDTOList.size(); i++) {
            if (loginId.equals(MemberRepository.memberDTOList.get(i).getMemberEmail())) {
                long mileageDTOS = MileageDTO.balance;
                mileageDTOS = mileageDTOS + MileageDTO.balance;
                mileageDTOList.get(i).set();
                MileageDTO mileageDTO = new MileageDTO(loginId, amount, 0);
                        memberDTO1 = mileageDTO;
                break; // 반복문을 빠져나감
            }
        }

        return memberDTO1;
    }

    public MileageDTO deposit(String loginId, long deposit) {
        MileageDTO mileageDTO1 = null;
        for (int i = 0; i < MemberRepository.memberDTOList.size(); i++) {
            if (loginId.equals(memberRepository.memberDTOList.get(i).getMemberEmail())) {
                MileageDTO mileageDTO = new MileageDTO(loginId, 0, deposit);


            }
        }
    }
}
