import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0 };
        int number1 = missingNumberBruteForce(arr);
        System.out.println(number1);

        int number2 = missingNumber(arr);
        System.out.println(number2);

        int number = missingNumberXOR(arr);
        System.out.println(number);
    }

    public static int missingNumberBruteForce(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums[nums.length - 1] + 1;
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;

        return actualSum - sum;
    }

    public static int missingNumberXOR(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];
        }

        return result;
    }

}
