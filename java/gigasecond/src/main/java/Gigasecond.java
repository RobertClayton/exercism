import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    static final long GIGASECOND = 1_000_000_000L;
    private final LocalDateTime birthDate;

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate.atStartOfDay();
    }
    Gigasecond(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    LocalDateTime getDate() {
        return birthDate.plusSeconds(GIGASECOND);
    }

}
