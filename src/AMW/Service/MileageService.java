package AMW.Service;

import AMW.Commonvariables;
import AMW.DTO.AirlineDTO;
import AMW.DTO.Flight;
import AMW.DTO.MemberDTO;
import AMW.DTO.MileageDTO;
import AMW.Repository.AirlineRepository;
import AMW.Repository.MileageRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MileageService {
    public static MileageRepository mileageRepository = new MileageRepository();
    public static AirlineRepository airlineRepository = new AirlineRepository();
    static Scanner scanner = new Scanner(System.in);
    public static List<MileageDTO> mileageDTOList = new ArrayList<>();
boolean run = true;

    public void amount() {
        while (run) {
            System.out.println("------------------------------------------");
            System.out.println("1.충전 | 2.잔액확인 | 3.출금 | 4.결제 | 0.종료");
            System.out.println("------------------------------------------");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                MileageDTO.balance = 0;
                System.out.println("입금할 금액을 입력하세요");
                long amount = scanner.nextInt();
                MileageDTO amount1 = mileageRepository.amount(Commonvariables.loginEmail, amount);
                if (amount1 != null) {
                    System.out.println("입금 완료");
                    System.out.println("현재 잔액 : " + amount1.getBalance());
                    mileageDTOList.add(amount1);
                } else
                    System.out.println("입금 실패");
            } else if (selectNo == 2) {
                for (int i = 0; i < mileageDTOList.size(); i++) {
                    if (Commonvariables.loginEmail.equals(mileageDTOList.get(i).getLoginId())) {
                        System.out.println("현재 잔액 : " + mileageDTOList.get(i).getBalance());
                    }
                }
            } else if (selectNo == 3) {
                System.out.println("출금할 금액을 입력하세요");
                long deposit = scanner.nextLong();
                MileageDTO deposit1 = mileageRepository.deposit(Commonvariables.loginEmail,deposit);
            } else if (selectNo == 4) {
                List<AirlineDTO> airlineDTOList = airlineRepository.flightCheck();
                System.out.println("아래 예약정보를 확인 후 맞으면 결제를 완료해주세요");
                System.out.println("airlineDTOList = " + airlineDTOList);
            }
        }
    }
}

