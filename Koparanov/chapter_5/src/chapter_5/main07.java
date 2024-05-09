package chapter_5;

import java.util.ArrayList;
import java.util.List;

public class main07 {
    public static void main(String[] args) {
        int[] numbers = {-2, -1, 1};

        List<List<Integer>> subsets = new ArrayList<>();

        int n = numbers.length;

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();

            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(numbers[j]);
                    sum += numbers[j];
                }
            }

            if (sum == 0) {
                subsets.add(subset);
            }
        }

        if (subsets.isEmpty()) {
            System.out.println("Няма подмножества със сума 0.");
        } else {
            System.out.println("Подмножества със сума 0:");
            for (List<Integer> subset : subsets) {
                System.out.println(subset);
            }
        }
    }
}
