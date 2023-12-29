package AMW.Repository;

import AMW.Commonvariables;
import AMW.DTO.AirlineDTO;
import AMW.DTO.MemberDTO;
import AMW.DTO.MileageDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    public List<MemberDTO> memberDTOList = new ArrayList<>();
    AirlineRepository airlineRepository = new AirlineRepository();

    public boolean check(String memberEmail) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
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
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                return true;
            }
        }
        return false;
    }

    public boolean update(String memberMobile) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (Commonvariables.loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(memberMobile);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String memberPassword) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTOList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<MemberDTO> memberCheck() {
        return memberDTOList;
    }


    public MemberDTO amount(String loginId, long amount) {
        MemberDTO memberDTO1 = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginId.equals(memberDTOList.get(i).getMemberEmail())) {
                MemberDTO member = memberDTOList.get(i);
                long currentBalance = member.getBalance(); // 현재 잔액을 가져옵니다.
                currentBalance += amount; // 입금된 금액을 잔액에 추가합니다.
                member.setBalance(currentBalance); // 잔액을 업데이트합니다.

                memberDTO1 = member;
                break; // 반복문을 빠져나갑니다.
            }
        }
        return memberDTO1;
    }

    public MemberDTO deposit(String loginId, long deposit) {
        MemberDTO memberDTO1 = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginId.equals(memberDTOList.get(i).getMemberEmail())) {
                MemberDTO member = memberDTOList.get(i);
                long currentBalance = member.getBalance(); // 현재 잔액을 가져옵니다.
                currentBalance -= deposit; // 입금된 금액을 잔액에 차감합니다.
                member.setBalance(currentBalance); // 잔액을 업데이트합니다.

                memberDTO1 = member;
                break; // 반복문을 빠져나갑니다.
            }
        }
        return memberDTO1;
    }

    public MemberDTO payment(String pass) {
        MemberDTO memberDTO = null;
        List<AirlineDTO> airlineDTOList = airlineRepository.flightCheck();
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (Commonvariables.loginEmail.equals(memberDTOList.get(i).getMemberEmail()) && pass.equals(memberDTOList.get(i).getMemberPassword())) {
                if (memberDTOList.get(i).getBalance() >= airlineDTOList.get(i).getPrice()) {
                MemberDTO memberDTOS = memberDTOList.get(i);
                long memberDTO1 = memberDTOS.getBalance();
                memberDTO1 = memberDTO1 - airlineDTOList.get(i).getPrice();
                memberDTOS.setBalance(memberDTO1);
                memberDTO = memberDTOS;
                }
            }
        }return memberDTO;
    }
}