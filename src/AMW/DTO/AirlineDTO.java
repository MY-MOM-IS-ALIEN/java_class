package AMW.DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AirlineDTO {

    private Long id;
    private String loginId;
    private String departureCity;
    private String arrivalCity;
    private int departureMonth;
    private int departureDay;
    private int departureHour;
    private int departureMinute;
    private int arrivalHour;
    private int arrivalMinute;
    private int price;
    private static int[] seat = new int[11];


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public int getDepartureMonth() {
        return departureMonth;
    }

    public void setDepartureMonth(int departureMonth) {
        this.departureMonth = departureMonth;
    }

    public int getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(int departureDay) {
        this.departureDay = departureDay;
    }

    public int getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(int departureHour) {
        this.departureHour = departureHour;
    }

    public int getDepartureMinute() {
        return departureMinute;
    }

    public void setDepartureMinute(int departureMinute) {
        this.departureMinute = departureMinute;
    }

    public int getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalHour(int arrivalHour) {
        this.arrivalHour = arrivalHour;
    }

    public int getArrivalMinute() {
        return arrivalMinute;
    }

    public void setArrivalMinute(int arrivalMinute) {
        this.arrivalMinute = arrivalMinute;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int[] getSeat() {
        return seat;
    }

    public void setSeat(int[] seat) {
        this.seat = seat;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public static Long idValue = 1L;
    public AirlineDTO(String loginId,String arrivalCity, int departureMonth, int departureDay, int departureHour, int departureMinute, int arrivalHour, int arrivalMinute, int price) {
        this.loginId = loginId;
        this.id = idValue++;
        this.arrivalCity = arrivalCity;
        this.departureMonth = departureMonth;
        this.departureDay = departureDay;
        this.departureHour = departureHour;
        this.departureMinute = departureMinute;
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = arrivalMinute;
        this.price = price;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "AirlineDTO{" +
                "id=" + id +
                ", loginId='" + loginId + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", departureMonth=" + departureMonth +
                ", departureDay=" + departureDay +
                ", departureHour=" + departureHour +
                ", departureMinute=" + departureMinute +
                ", arrivalHour=" + arrivalHour +
                ", arrivalMinute=" + arrivalMinute +
                ", price=" + price +
                '}';
    }
}
