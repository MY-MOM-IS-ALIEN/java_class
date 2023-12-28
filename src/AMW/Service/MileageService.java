package AMW.Service;

import AMW.Repository.MileageRepository;

import java.util.Scanner;

public class MileageService {
    AirlineService airlineService = new AirlineService();
    MileageRepository mileageRepository = new MileageRepository();
    static Scanner scanner = new Scanner(System.in);

    public static void amount() {
        System.out.println("----------------------------------");
        System.out.println("1.충전 | 2.잔액확인 | 3.출금 | 4.종료");
        System.out.println("----------------------------------");
        int selectNo = scanner.nextInt();
        if(selectNo == 1){
            System.out.println("입금할 금액을 입력하세요");
            long amount = scanner.nextInt();

        }
    }
}
