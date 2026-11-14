import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
    public static void main(String[] args) {
        int[][] r1 = findMissingRanges(new int[] { 0, 1, 3, 50, 75 }, 0, 99);
        // expected: [[2,2],[4,49],[51,74],[76,99]]
        for (int[] range : r1) {
            System.out.println(Arrays.toString(range));
        }
    }

    public static int[][] findMissingRanges(int[] nums, int lower, int upper) {
        List<int[]> result = new ArrayList<>();

        // TODO: fill result with the missing ranges
        // 1. gap before the first element
        // 2. gaps between consecutive elements
        // 3. gap after the last element
        // 4. handle the empty-array case

        // Handle empty array
        if (nums.length == 0) {
            result.add(new int[] { lower, upper });
            return result.toArray(new int[0][]);

        }

        // 1. Gap before first element
        if (nums[0] > lower) {
            result.add(new int[] { lower, nums[0] - 1 });
        }

        for (int i = 0; i < nums.length - 1; i++) {
            // 2. Gaps between elements
            if (nums[i + 1] - nums[i] > 1) {
                int start = nums[i] + 1;
                int end = nums[i + 1] - 1;
                result.add(new int[] { start, end });
            }
        }

        // 3. Gap after last element
        if (nums[nums.length - 1] < upper) {
            int start = nums[nums.length - 1] + 1;
            int end = upper;
            result.add(new int[] { start, end });
        }

        return result.toArray(new int[0][]);
    }
}
