import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class GroupBogiesByTypeUC9Test {

    @Test
    void testGrouping_BogiesGroupedByType() {
        List<PassengerBogieUC9> bogies = List.of(
                new PassengerBogieUC9("Sleeper", 72),
                new PassengerBogieUC9("Sleeper", 75)
        );

        Map<String, List<PassengerBogieUC9>> result =
                GroupBogiesByTypeUC9.groupBogiesByType(bogies);

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        List<PassengerBogieUC9> bogies = List.of(
                new PassengerBogieUC9("Sleeper", 72),
                new PassengerBogieUC9("AC Chair", 60)
        );

        Map<String, List<PassengerBogieUC9>> result =
                GroupBogiesByTypeUC9.groupBogiesByType(bogies);

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<PassengerBogieUC9> bogies = new ArrayList<>();

        Map<String, List<PassengerBogieUC9>> result =
                GroupBogiesByTypeUC9.groupBogiesByType(bogies);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        List<PassengerBogieUC9> bogies = List.of(
                new PassengerBogieUC9("Sleeper", 72),
                new PassengerBogieUC9("AC Chair", 60),
                new PassengerBogieUC9("First Class", 40)
        );

        Map<String, List<PassengerBogieUC9>> result =
                GroupBogiesByTypeUC9.groupBogiesByType(bogies);

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<PassengerBogieUC9> bogies = new ArrayList<>();
        bogies.add(new PassengerBogieUC9("Sleeper", 72));

        GroupBogiesByTypeUC9.groupBogiesByType(bogies);

        assertEquals(1, bogies.size());
    }
}