import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SafetyComplianceUC12Test {

    @Test
    void testSafety_AllBogiesValid() {
        List<GoodsBogieUC12> bogies = List.of(
                new GoodsBogieUC12("Cylindrical", "Petroleum"),
                new GoodsBogieUC12("Open", "Coal")
        );

        assertTrue(SafetyComplianceUC12.isTrainSafe(bogies));
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogieUC12> bogies = List.of(
                new GoodsBogieUC12("Cylindrical", "Coal")
        );

        assertFalse(SafetyComplianceUC12.isTrainSafe(bogies));
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<GoodsBogieUC12> bogies = List.of(
                new GoodsBogieUC12("Open", "Coal"),
                new GoodsBogieUC12("Box", "Grain")
        );

        assertTrue(SafetyComplianceUC12.isTrainSafe(bogies));
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<GoodsBogieUC12> bogies = List.of(
                new GoodsBogieUC12("Cylindrical", "Petroleum"),
                new GoodsBogieUC12("Cylindrical", "Coal")
        );

        assertFalse(SafetyComplianceUC12.isTrainSafe(bogies));
    }

    @Test
    void testSafety_EmptyBogieList() {
        List<GoodsBogieUC12> bogies = new ArrayList<>();

        assertTrue(SafetyComplianceUC12.isTrainSafe(bogies));
    }
}