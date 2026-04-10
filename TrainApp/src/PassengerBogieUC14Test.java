import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidCapacityUC14Test {

    @Test
    void testException_ValidCapacityCreation() {
        assertDoesNotThrow(() -> {
            new PassengerBogieUC14("Sleeper", 50);
        });
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception e = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogieUC14("Sleeper", -10);
        });

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogieUC14("Sleeper", 0);
        });
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception e = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogieUC14("AC", -5);
        });

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {
        PassengerBogieUC14 b = new PassengerBogieUC14("Sleeper", 70);

        assertEquals("Sleeper", b.getType());
        assertEquals(70, b.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() {
        assertDoesNotThrow(() -> {
            new PassengerBogieUC14("Sleeper", 70);
            new PassengerBogieUC14("AC", 60);
        });
    }
}