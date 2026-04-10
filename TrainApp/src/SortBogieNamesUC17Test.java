import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortBogieNamesUC17Test {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        SortBogieNamesUC17.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair", "First Class", "General", "Luxury", "Sleeper"},
                arr
        );
    }

    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury", "General", "Sleeper", "AC Chair"};

        SortBogieNamesUC17.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair", "General", "Luxury", "Sleeper"},
                arr
        );
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair", "First Class", "General"};

        SortBogieNamesUC17.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair", "First Class", "General"},
                arr
        );
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper", "AC Chair", "Sleeper", "General"};

        SortBogieNamesUC17.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair", "General", "Sleeper", "Sleeper"},
                arr
        );
    }

    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};

        SortBogieNamesUC17.sortBogieNames(arr);

        assertArrayEquals(new String[]{"Sleeper"}, arr);
    }
}