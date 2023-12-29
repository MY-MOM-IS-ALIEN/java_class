package AMW.Repository;

import AMW.Commonvariables;
import AMW.DTO.AirlineDTO;
import AMW.DTO.Flight;
import AMW.DTO.MemberDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AirlineRepository {

    List<Flight> osakaFlights = new ArrayList<>();
    int[] seat = new int[11];
    public List<AirlineDTO> airlineDTOList = new ArrayList<>();
    List<MemberDTO>memberDTOList = new ArrayList<>();


    public List<Flight> generateFlightsToOsaka(int month, int day, int hour) {
        LocalDateTime departureDateTime = LocalDateTime.of(2024, month, day, hour, 0); // 분을 0으로 설정

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            LocalDate departureDate = departureDateTime.toLocalDate(); // 날짜 추출
            LocalTime departureTime = departureDateTime.toLocalTime(); // 시간 추출

            LocalDateTime departure = LocalDateTime.of(departureDate, departureTime);

            LocalDateTime randomDeparture = departure.plusHours(random.nextInt(24))
                    .plusMinutes(random.nextInt(60));

            int durationHours = random.nextInt(1) + 1;
            int durationMinutes = random.nextInt(60);
            LocalDateTime arrival = randomDeparture.plusHours(durationHours)
                    .plusMinutes(durationMinutes);

            long price = random.nextLong(120000) + 100000;

            Flight flight = new Flight("오사카", randomDeparture.getMonthValue(), randomDeparture.getDayOfMonth(),
                    randomDeparture.getHour(), randomDeparture.getMinute(), arrival.getHour(), arrival.getMinute(), price);
            osakaFlights.add(flight);
        }

        return osakaFlights;
    }

    public boolean reservation(Long id) {
        boolean result = false;
        for (int i = 0; i < osakaFlights.size(); i++) {
            if (id.equals(osakaFlights.get(i).getId())) {
                result = true;
                return result;
            }
        }
        return result;
    }

    public boolean checkSeat(Long id, int seatNo) {
        for (int i = 0; i < osakaFlights.size(); i++) {
            if (id.equals(osakaFlights.get(i).getId())) {
                if (seat[seatNo] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public AirlineDTO seatSelec(Long id, int seatNo) {
        for (int i = 0; i < osakaFlights.size(); i++) {
            if (id.equals(osakaFlights.get(i).getId())) {
                if (seat[seatNo] == 0) {
                    seat[seatNo] = 1;
                    AirlineDTO airlineDTO = new AirlineDTO(Commonvariables.loginEmail, osakaFlights.get(i).getArrivalCity(), osakaFlights.get(i).getDepartureMonth(), osakaFlights.get(i).getDepartureDay(), osakaFlights.get(i).getDepartureHour(), osakaFlights.get(i).getDepartureMinute(), osakaFlights.get(i).getArrivalHour(), osakaFlights.get(i).getArrivalMinute(), osakaFlights.get(i).getPrice());
                    airlineDTOList.add(airlineDTO);
                    return airlineDTO;
                } else {
                    return null;
                }
            }
        }
        return null; // 해당 ID의 항공편을 찾지 못함
    }

    public List<AirlineDTO> flightCheck() {
        return airlineDTOList;
    }

    public boolean blackconsumer(Long id) {
        for (int i = 0; i < airlineDTOList.size(); i++) {
            if (id.equals(airlineDTOList.get(i).getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean cancle(Long id) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < airlineDTOList.size(); i++) {
            if (id.equals(airlineDTOList.get(i).getId())){
                MemberDTO memberDTOS = memberDTOList.get(i);
                long memberDTO1 = memberDTOS.getBalance();
                memberDTO1 = memberDTO1 + airlineDTOList.get(i).getPrice();
                memberDTOS.setBalance(memberDTO1);
                memberDTO = memberDTOS;
                airlineDTOList.remove(i);
                return true;
            }
        }
        return false;
    }
}