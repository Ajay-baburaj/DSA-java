import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };
        int[] result = mergetSort(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergetSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] lefthalf = mergetSort(Arrays.copyOfRange(nums, 0, mid));
        int[] rightHalf = mergetSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(lefthalf, rightHalf);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int p1 = 0;
        int p2 = 0;
        int k = 0;

        while (p1 < left.length && p2 < right.length) {
            if (left[p1] <= right[p2]) {
                result[k] = left[p1];
                p1++;
            } else {
                result[k] = right[p2];
                p2++;
            }
            k++;
        }

        // Copy remaining elements from left
        while (p1 < left.length) {
            result[k] = left[p1];
            p1++;
            k++;
        }

        // Copy remaining elements from right
        while (p2 < right.length) {
            result[k] = right[p2];
            p2++;
            k++;
        }

        return result;
    }
}