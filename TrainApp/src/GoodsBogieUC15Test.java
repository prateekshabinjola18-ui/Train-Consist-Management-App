import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SafeCargoUC15Test {

    @Test
    void testCargo_SafeAssignment() {
        GoodsBogieUC15 b = new GoodsBogieUC15("Cylindrical");
        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        GoodsBogieUC15 b = new GoodsBogieUC15("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.getCargo()); // should not assign
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogieUC15 b = new GoodsBogieUC15("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.getCargo());
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        GoodsBogieUC15 b = new GoodsBogieUC15("Rectangular");

        b.assignCargo("Petroleum"); // fails
        b.assignCargo("Coal");      // should work

        assertEquals("Coal", b.getCargo());
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        GoodsBogieUC15 b = new GoodsBogieUC15("Rectangular");

        // Just checking no crash and flow completes
        assertDoesNotThrow(() -> b.assignCargo("Petroleum"));
    }
}