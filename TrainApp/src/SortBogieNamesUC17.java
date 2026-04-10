import java.util.Arrays;

// 🔥 Main Class
public class SortBogieNamesUC17 {

    public static void sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames);
    }

    public static void main(String[] args) {

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        sortBogieNames(bogieNames);

        System.out.println("After Sorting: " + Arrays.toString(bogieNames));
    }
}