package AMW.Service;

import AMW.Commonvariables;
import AMW.DTO.AirlineDTO;
import AMW.DTO.Flight;
import AMW.DTO.MemberDTO;
import AMW.DTO.MileageDTO;
import AMW.Repository.AirlineRepository;
import AMW.Repository.MemberRepository;

import java.util.*;


public class AirlineService {
    AirlineRepository airlineRepository = new AirlineRepository();
    MemberRepository memberRepository = new MemberRepository();
    //    MileageService mileageService = new MileageService();
    Scanner scanner = new Scanner(System.in);
    public static List<MemberDTO> memberDTOList = new ArrayList<>();
    boolean run = true;

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
                    System.out.println("결제를 완료해주세요.");
                    while (run) {
                        System.out.println("------------------------------------------");
                        System.out.println("1.충전 | 2.잔액확인 | 3.출금 | 4.결제 | 0.종료");
                        System.out.println("------------------------------------------");
                        int selectNo = scanner.nextInt();
                        if (selectNo == 1) {
                            System.out.println("입금할 금액을 입력하세요");
                            long amount = scanner.nextLong();
                            MemberDTO amount1 = memberRepository.amount(Commonvariables.loginEmail, amount);
                            if (amount1 != null) {
                                System.out.println("입금 완료");
                                System.out.println("현재 잔액 : " + amount1.getBalance());
                            } else
                                System.out.println("입금 실패");
                            System.out.println(amount1);
                        } else if (selectNo == 2) {
                            List<MemberDTO> memberDTOS = memberRepository.memberCheck();
                            for (int i = 0; i < memberDTOS.size(); i++) {
                                if (Commonvariables.loginEmail.equals(memberDTOS.get(i).getMemberEmail())) {
                                    System.out.println("memberDTOS = " + memberDTOS.get(i).getBalance());
                                }
                            }
                        } else if (selectNo == 3) {
                            System.out.println("출금할 금액을 입력하세요");
                            long deposit = scanner.nextLong();
                            MemberDTO memberDTO = memberRepository.deposit(Commonvariables.loginEmail, deposit);
                            if (memberDTO != null) {
                                if (Commonvariables.loginEmail.equals(memberDTO.getMemberEmail())) {
                                    System.out.println("현재 잔액 : " + memberDTO.getBalance());
                                }
                            }
                        } else if (selectNo == 4) {
                            List<AirlineDTO> airlineDTOList = airlineRepository.flightCheck();
                            for (int i = 0; i < airlineDTOList.size(); i++) {
                                if(Commonvariables.loginEmail.equals(airlineDTOList.get(i).getLoginId()))
                                System.out.println("airlineDTOList = " + airlineDTOList.get(i));
                            }
                            System.out.println("예약정보가 맞으면 결제를 계속 진행해주세요");
                            System.out.println("---------------------------");
                            System.out.println("1.계속 진행 | 2.메뉴로 돌아가기");
                            System.out.println("---------------------------");
                            int selectNo1 = scanner.nextInt();
                            if (selectNo1 == 1) {
                                System.out.println("비밀번호를 입력해주세요");
                                String pass = scanner.next();
                                MemberDTO memberDTO = memberRepository.payment(pass);
                                    System.out.println("memberDTO = " + memberDTO);
                                if (memberDTO != null) {
                                    System.out.println("예약 완료");
                                } else {
                                    System.out.println("예약 실패");
                                }
                            } else {
                                System.out.println("비밀번호가 일치하지 않습니다.");
                            }
                        } else if (selectNo == 0) {
                            run = false;
                        }
                    }
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

    public void findMyFlight() {
        List<AirlineDTO> airlineDTOList = airlineRepository.flightCheck();
        List<MemberDTO> memberDTOList = memberRepository.memberCheck();
        boolean foundReservation = false;

        for (int i = 0; i < memberDTOList.size(); i++) {
            if (Commonvariables.loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                System.out.println(memberDTOList.get(i).getMemberName() + "님의 예약정보");
                for (AirlineDTO airline : airlineDTOList) {
                    if (airline.getId().equals(memberDTOList.get(i).getId())) {
                        System.out.println("항공편 번호 : " + airline.getId() + " | 예약자명 : " + memberDTOList.get(i).getMemberName() + " | 도착지 : 오사카 " + "| 비행시간 : " + airline.getDepartureMonth() + "." + airline.getDepartureDay() + "일 " + airline.getDepartureHour() + ":" + airline.getDepartureMinute() + " ~ " + airline.getArrivalHour() + ":" + airline.getArrivalMinute() + " | 결제금액 : " + airline.getPrice());
                        foundReservation = true;
                        break;
                    }
                }
            }
        }

        if (!foundReservation) {
            System.out.println("예약된 정보가 없습니다.");
        }
    }

    public void blackconsumer() {
        System.out.println("취소할 항공편을 선택해주세요");
        long id = scanner.nextInt();
        boolean filghtCheck = airlineRepository.blackconsumer(id);
        if (filghtCheck) {
            System.out.println("정말 취소하시겠습니까?");
            System.out.println("--------------");
            System.out.println("1.예 | 2.아니오");
            System.out.println("--------------");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.println("비밀번호를 한번 더 입력해주세요");
                String pass = scanner.next();
                for (int i = 0; i < memberDTOList.size(); i++) {
                    if (pass.equals(memberDTOList.get(i).getMemberPassword())) {
                        MemberDTO cancel = airlineRepository.cancle(id);
                        if (cancel != null) {
                            System.out.println("항공권 예약이 취소 되었습니다");
                        } else {
                            System.out.println("비밀번호가 일치하지 않습니다.");
                        }
                    }
                }
            } else {
                System.out.println("예약된 정보가 없습니다.");
            }
        }
    }
}






