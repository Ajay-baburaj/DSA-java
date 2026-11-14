public class SingleNumber {
    public static void main(String[] args) {
        int[] num = { 2, 2, 1 };
        int result = singleNumber(num);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        int val = 0;
        for (int num : nums) {
            val ^= num;
        }

        return val;
    }
}
