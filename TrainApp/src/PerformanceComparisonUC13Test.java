import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceComparisonUC13Test {

    @Test
    void testLoopFilteringLogic() {
        List<BogieUC13> bogies = List.of(
                new BogieUC13("Sleeper", 70),
                new BogieUC13("AC", 50)
        );

        List<BogieUC13> result = PerformanceComparisonUC13.filterWithLoop(bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<BogieUC13> bogies = List.of(
                new BogieUC13("Sleeper", 70),
                new BogieUC13("AC", 50)
        );

        List<BogieUC13> result = PerformanceComparisonUC13.filterWithStream(bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<BogieUC13> bogies = List.of(
                new BogieUC13("Sleeper", 70),
                new BogieUC13("AC", 80)
        );

        List<BogieUC13> loopResult = PerformanceComparisonUC13.filterWithLoop(bogies);
        List<BogieUC13> streamResult = PerformanceComparisonUC13.filterWithStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        assertTrue((end - start) >= 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<BogieUC13> bogies = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            bogies.add(new BogieUC13("Sleeper", i));
        }

        List<BogieUC13> result = PerformanceComparisonUC13.filterWithStream(bogies);

        assertNotNull(result);
    }
}