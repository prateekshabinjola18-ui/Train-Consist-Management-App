import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TotalSeatsUC10Test {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<PassengerBogieUC10> bogies = List.of(
                new PassengerBogieUC10("Sleeper", 72),
                new PassengerBogieUC10("AC Chair", 60)
        );

        int result = TotalSeatsUC10.calculateTotalSeats(bogies);

        assertEquals(132, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<PassengerBogieUC10> bogies = List.of(
                new PassengerBogieUC10("Sleeper", 72)
        );

        int result = TotalSeatsUC10.calculateTotalSeats(bogies);

        assertEquals(72, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<PassengerBogieUC10> bogies = new ArrayList<>();

        int result = TotalSeatsUC10.calculateTotalSeats(bogies);

        assertEquals(0, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<PassengerBogieUC10> bogies = List.of(
                new PassengerBogieUC10("Sleeper", 72),
                new PassengerBogieUC10("AC Chair", 60),
                new PassengerBogieUC10("First Class", 40)
        );

        int result = TotalSeatsUC10.calculateTotalSeats(bogies);

        assertEquals(172, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<PassengerBogieUC10> bogies = new ArrayList<>();
        bogies.add(new PassengerBogieUC10("Sleeper", 72));

        TotalSeatsUC10.calculateTotalSeats(bogies);

        assertEquals(1, bogies.size());
    }
}