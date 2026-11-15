
public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        // int result = findPivotIndexBruteForce(nums);
        // int result = findPivotIndexPrefixSuffix(nums);
        int result = findPivotIndexOptimal(nums);
        System.out.println(result);
    }

    public static int findPivotIndexBruteForce(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // left side calculation:
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                leftSum += arr[j];
            }

            // right side calculation:
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }

            if (leftSum == rightSum)
                return i;

        }
        return -1;
    }

    public static int findPivotIndexPrefixSuffix(int arr[]) {
        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // 1.create prefix array
        prefix[0] = arr[0];
        for (int k = 1; k < arr.length; k++) {
            prefix[k] = prefix[k - 1] + arr[k];
        }

        suffix[n - 1] = arr[n - 1];
        for (int k = n - 2; k >= 0; k--) {
            suffix[k] = suffix[k + 1] + arr[k];
        }

        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = (i == n - 1) ? 0 : suffix[i + 1];

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static int findPivotIndexOptimal(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = total - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;

    }

}
