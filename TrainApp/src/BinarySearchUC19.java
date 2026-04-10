import java.util.Arrays;

// 🔥 Main Class
public class BinarySearchUC19 {

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        // 🔥 Ensure sorted
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(arr[mid]);

            if (result == 0) {
                return true; // found
            } else if (result > 0) {
                low = mid + 1; // go right
            } else {
                high = mid - 1; // go left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};

        String key = "BG205";

        boolean found = binarySearch(bogies, key);

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}