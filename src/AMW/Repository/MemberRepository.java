package AMW.Repository;

import AMW.Commonvariables;
import AMW.DTO.AirlineDTO;
import AMW.DTO.MemberDTO;
import AMW.DTO.MileageDTO;
import AMW.Service.AirlineService;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    public static List<MemberDTO> memberDTOList = new ArrayList<>();
    public static AirlineRepository airlineRepository = new AirlineRepository();
    List<AirlineDTO>airlineDTOList = new ArrayList<>();

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
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginId.equals(memberDTOList.get(i).getMemberEmail())) {
                MemberDTO member = memberDTOList.get(i);
                long currentBalance = member.getBalance();
                currentBalance += amount;
                member.setBalance(currentBalance);

                MemberDTO memberDTO1 = member;
                return memberDTO1;
            }
        }
        return null;
    }

    public MemberDTO deposit(String loginId, long deposit) {
        MemberDTO memberDTO1 = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginId.equals(memberDTOList.get(i).getMemberEmail())) {
                MemberDTO member = memberDTOList.get(i);
                long currentBalance = member.getBalance();
                currentBalance -= deposit;
                member.setBalance(currentBalance);

                memberDTO1 = member;
                break;
            }
        }
        return memberDTO1;
    }

    public MemberDTO payment(String pass) {
        List<AirlineDTO>airlineDTOList = airlineRepository.flightCheck();
        MemberDTO memberDTO1 = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(Commonvariables.loginEmail.equals(memberDTOList.get(i).getMemberEmail()) && pass.equals(memberDTOList.get(i).getMemberPassword())){
                MemberDTO memberDTOS = memberDTOList.get(i);
                long memberDTO = memberDTOList.get(i).getBalance();
                memberDTO -= airlineDTOList.get(i).getPrice();
                memberDTOS.setBalance(memberDTO);

                memberDTO1 = memberDTOS;
            }
        }return memberDTO1;
    }
}