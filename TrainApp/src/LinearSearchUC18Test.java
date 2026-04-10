import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchUC18Test {

    @Test
    void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(LinearSearchUC18.searchBogie(arr, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(LinearSearchUC18.searchBogie(arr, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(LinearSearchUC18.searchBogie(arr, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(LinearSearchUC18.searchBogie(arr, "BG309"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};

        assertTrue(LinearSearchUC18.searchBogie(arr, "BG101"));
    }
}