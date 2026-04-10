import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class BogieUC8Test {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<PassengerBogieUC8> bogies = List.of(
                new PassengerBogieUC8("Sleeper", 72),
                new PassengerBogieUC8("AC Chair", 60),
                new PassengerBogieUC8("General", 90)
        );

        List<PassengerBogieUC8> result =
                FilterPassengerBogiesUsingStreams.filterBogiesByCapacity(bogies, 70);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<PassengerBogieUC8> bogies = new ArrayList<>();

        List<PassengerBogieUC8> result =
                FilterPassengerBogiesUsingStreams.filterBogiesByCapacity(bogies, 70);

        assertTrue(result.isEmpty());
    }
}