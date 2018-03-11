import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime birthDate;
    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDate = birthDateTime;
    }

    LocalDateTime getDate() {
        return this.birthDate.plusSeconds(1000000000);
    }

}
