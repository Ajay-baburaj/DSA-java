public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1 };
        int results = maxConsecutiveOnes(nums);
        System.out.println(results);
    }

    public static int maxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
                if (count > maxCount)
                    maxCount = count;
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

}
