import java.util.*;
import java.util.stream.Collectors;

// ✅ Bogie Class
class BogieUC13 {
    String type;
    int capacity;

    public BogieUC13(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

// 🔥 Main Class
public class PerformanceComparisonUC13 {

    // 🔹 Loop Filtering
    public static List<BogieUC13> filterWithLoop(List<BogieUC13> bogies) {
        List<BogieUC13> result = new ArrayList<>();
        for (BogieUC13 b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // 🔹 Stream Filtering
    public static List<BogieUC13> filterWithStream(List<BogieUC13> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<BogieUC13> bogies = new ArrayList<>();

        // 🔥 Large dataset
        for (int i = 0; i < 100000; i++) {
            bogies.add(new BogieUC13("Sleeper", i % 100));
        }

        // 🔹 Loop timing
        long startLoop = System.nanoTime();
        List<BogieUC13> loopResult = filterWithLoop(bogies);
        long endLoop = System.nanoTime();

        // 🔹 Stream timing
        long startStream = System.nanoTime();
        List<BogieUC13> streamResult = filterWithStream(bogies);
        long endStream = System.nanoTime();

        // Results
        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");

        // Check same result
        System.out.println("Same Result Size: " +
                (loopResult.size() == streamResult.size()));
    }
}