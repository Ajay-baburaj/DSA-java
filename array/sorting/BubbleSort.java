import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 6, 3, 1, 2 };
        int[] result = bubbleSort(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return nums;
    }

}
