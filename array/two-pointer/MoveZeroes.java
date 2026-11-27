import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeros(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                if (fast != slow) {
                    int temp = nums[slow];
                    nums[slow] = nums[fast];
                    nums[fast] = temp;
                }
                slow++;
            }
            fast++;
        }
    }
}
