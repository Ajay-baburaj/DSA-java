public class SortedRotated {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        boolean result = checkSortedOrRotated(arr);
        System.out.println(result);
    }

    public static boolean checkSortedOrRotated(int[] nums) {
        int drop = 0;

        for (int i = 0; i < nums.length; i++) {
            int next = nums[(i + 1) % nums.length];
            if (nums[i] > next) {
                drop++;
            }
        }

        return drop <= 1;
    }
}


