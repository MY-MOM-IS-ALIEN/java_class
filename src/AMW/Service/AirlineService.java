package AMW.Service;

import AMW.DTO.AirlineDTO;
import AMW.DTO.Flight;
import AMW.Repository.AirlineRepository;

import java.util.*;


public class AirlineService {
    AirlineRepository airlineRepository = new AirlineRepository();
    MileageService mileageService = new MileageService();
    Scanner scanner = new Scanner(System.in);

    public void findAll() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("출발 월을 입력하세요 (숫자로)");
        int month = scanner.nextInt();

        System.out.println("출발 일을 입력하세요 (숫자로)");
        int day = scanner.nextInt();

        System.out.println("출발 시간을 입력하세요 (숫자로, 24시간제)");
        int hour = scanner.nextInt();

        List<Flight> osakaFlights = airlineRepository.generateFlightsToOsaka(month, day, hour);
        for (Flight flight : osakaFlights) {
            System.out.println(flight);
        }
    }

    public void reservation() {
        System.out.println("예매하실 항공편 번호를 입력해주세요");
        Long id = scanner.nextLong();
        boolean airlineDTO = airlineRepository.reservation(id);
        if (airlineDTO) {
            System.out.println("좌석을 선택해주세요");
            System.out.println("1~10번 좌석 중 선택");
            int seatNo = scanner.nextInt();
            boolean airlineDTO1 = airlineRepository.checkSeat(id, seatNo);
            if (airlineDTO1) {
                AirlineDTO airlineDTO2 = airlineRepository.seatSelec(id, seatNo);
                if (airlineDTO2 != null) {
                    System.out.println("좌석 선택이 완료되었습니다.");
                    System.out.println("결제 후 예약이 완료됩니다.");
                    mileageService.amount();
                } else {
                    System.out.println("좌석 선택 중 문제가 발생했습니다.");
                }
            } else {
                System.out.println("이미 선택된 좌석입니다. 다른 좌석을 선택해주세요.");
            }
        } else {
            System.out.println("해당 항공편은 예약이 불가능합니다.");
        }
    }
}





