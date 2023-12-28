package AMW.Repository;

import AMW.DTO.Flight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AirlineRepository {

    List<Flight> osakaFlights = new ArrayList<>();
    int[] seat = new int[11];

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

            int price = random.nextInt(120000) + 100000;

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

    public boolean checkSeat(Long id,int seatNo) {
        for (int i = 0; i < osakaFlights.size(); i++) {
            if (id.equals(osakaFlights.get(i).getId())) {
                if(seat[seatNo] == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean seatSelec(Long id, int seatNo) {
        for (int i = 0; i < osakaFlights.size(); i++) {
            if (id.equals(osakaFlights.get(i).getId())) {
                if(seat[seatNo] == 0){
                    seat[seatNo] = 1;
                    return true;

                } else {
                    return false;
                }
            }
        }
        return false; // 해당 ID의 항공편을 찾지 못함
    }
}