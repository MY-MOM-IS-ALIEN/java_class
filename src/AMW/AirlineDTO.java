package AMW;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AirlineDTO {

    private Long id;
    private String airlineSchedule;
    private String airlineToAirfort;
    private String airlineFromAirfort;
    private String createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirlineSchedule() {
        return airlineSchedule;
    }

    public void setAirlineSchedule(String airlineSchedule) {
        this.airlineSchedule = airlineSchedule;
    }

    public String getAirlineToAirfort() {
        return airlineToAirfort;
    }

    public void setAirlineToAirfort(String airlineToAirfort) {
        this.airlineToAirfort = airlineToAirfort;
    }

    public String getAirlineFromAirfort() {
        return airlineFromAirfort;
    }

    public void setAirlineFromAirfort(String airlineFromAirfort) {
        this.airlineFromAirfort = airlineFromAirfort;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
private static Long idValue = 1L;
    public AirlineDTO(String airlineSchedule, String airlineToAirfort, String airlineFromAirfort) {
        this.id = idValue++;
        this.airlineSchedule = airlineSchedule;
        this.airlineToAirfort = airlineToAirfort;
        this.airlineFromAirfort = airlineFromAirfort;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
