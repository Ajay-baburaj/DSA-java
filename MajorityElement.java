public class MajorityElement {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 1, 2, 1, 2, 1 };
        int result = findMajorityElement(input);
        System.out.println(result);

    }

    public static int findMajorityElement(int nums[]) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

        }
        return candidate;
    }
}
