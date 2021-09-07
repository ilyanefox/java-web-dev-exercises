package exercises;
import java.util.ArrayList;

public class ArrayListTwo {
    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }
}
