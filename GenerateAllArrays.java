import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateAllArrays {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        // Input: arr[] = [1, 2, 3];
        // Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]];
        List<List<Integer>> resuList = generateSubArray(nums);
        System.out.println(resuList);
    }

    public static List<List<Integer>> generateSubArray(int[] arr) {
        List<List<Integer>> nums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) { // i = start
            for (int j = i; j < arr.length; j++) { // j = end (starts at i, not 0)
                List<Integer> numsList = new ArrayList<>();
                for (int k = i; k <= j; k++) { // build ONE subarray
                    numsList.add(arr[k]);
                }
                nums.add(numsList); // save it ONCE, after k finishes
            }
        }
        return nums;
    }
}
