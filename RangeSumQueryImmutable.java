public class RangeSumQueryImmutable {

    public static void main(String[] args) {
        int[] input = { -2, 0, 3, -5, 2, -1 };
        NumArray numArray = new NumArray(input);

        System.out.println(numArray.sumRange(0, 2)); // expected 1
        System.out.println(numArray.sumRange(2, 5)); // expected -1
        System.out.println(numArray.sumRange(0, 5)); // expected -3
    }

    static class NumArray {
        int[] prefix;

        public NumArray(int[] nums) {
            prefix = new int[nums.length];
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                prefix[i] = sum;
            }
        }

        public int sumRange(int left, int right) {
            int prefixSum = left == 0 ? prefix[right] : prefix[right] - prefix[left - 1];
            return prefixSum;
        }
    }
}
