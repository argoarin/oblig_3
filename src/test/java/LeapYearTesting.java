import org.example.LeapYear;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeapYearTesting {
    @Test
    void testing_1600() {
        assertEquals(true, LeapYear.LeapYearChecking(1600));
    }
    @Test
    void testing_1550() {
        assertEquals(false, LeapYear.LeapYearChecking(1550));
    }
    @Test
    void testing_1200() {
        assertEquals(true, LeapYear.LeapYearChecking(1200));
    }
    @Test
    void testing_2400() {
        assertEquals(true, LeapYear.LeapYearChecking(2400));
    }

}
