import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = new int[] { 4, 5, 6, 0, 0, 0 };
        int[] nums2 = new int[] { 1, 2, 3 };

        int[] result = merge(num1, 3, nums2, 3);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] num1, int m, int[] num2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && num1[p1] >= num2[p2]) {
                num1[i] = num1[p1];
                p1--;
            } else {
                num1[i] = num2[p2];
                p2--;
            }
        }
        return num1;
    }

}
