package AMW.Service;

import AMW.Commonvariables;
import AMW.DTO.MemberDTO;
import AMW.DTO.MileageDTO;
import AMW.Repository.MileageRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MileageService {
    public static MileageRepository mileageRepository = new MileageRepository();
    static Scanner scanner = new Scanner(System.in);

    public static void amount() {
        System.out.println("------------------------------------------");
        System.out.println("1.충전 | 2.잔액확인 | 3.출금 | 4.결제 | 0.종료");
        System.out.println("------------------------------------------");
        int selectNo = scanner.nextInt();
        if (selectNo == 1) {
            System.out.println("입금할 금액을 입력하세요");
            long amount = scanner.nextInt();
            List<MemberDTO> amount2 = mileageRepository.memberCheck();
            MemberDTO amount1 = mileageRepository.amount(Commonvariables.loginEmail,amount);
            if(amount2 != null){
                System.out.println("입금 완료");
                System.out.println("현재 잔액 : " + amount1);
            }else{
                System.out.println("입금 실패");
            }
        }
    }
}
