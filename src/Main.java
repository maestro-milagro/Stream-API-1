import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        List<Integer> list = new ArrayList<>();

        for (int number : array) {
            if ((number > 0) && (number % 2 == 0)) {
                list.add(number);
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
