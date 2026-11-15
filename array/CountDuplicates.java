import java.util.Arrays;
import java.util.HashMap;

public class CountDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 2 };
        // { 5, 5, 5, 7, 7, 7 };
        int answer = countPairsWithDuplicates(arr, 6);
        int answer2 = countPairsWithDuplicatesHasMap(arr, 6);
        System.out.println("answer : " + answer);
        System.out.println("answer2 : " + answer2);

    }

    // Two pointer approach
    public static int countPairsWithDuplicates(int arr[], int target) {
        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                left++;
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                // if both sides are the same number (e.g. 3 + 3 = 6), every element
                // between left and right is that number: pick any 2 of them
                if (arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count = count + n * (n - 1) / 2;
                    break;
                }

                int internalLeft = left;
                int duplicateLeftCount = 0;
                while (internalLeft <= right && arr[internalLeft] == arr[left]) {
                    duplicateLeftCount++;
                    internalLeft++;
                }

                System.out.println("left duplicate count: " + duplicateLeftCount);

                int internalRight = right;
                int duplicateRightCount = 0;
                while (internalRight >= left && arr[internalRight] == arr[right]) {
                    duplicateRightCount++;
                    internalRight--;
                }
                count = count + duplicateRightCount * duplicateLeftCount;
                left = internalLeft;
                right = internalRight;
            }

        }
        return count;
    }

    public static int countPairsWithDuplicatesHasMap(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        // added into map
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // iterate and check the count;
        for (int num : map.keySet()) {
            int other = target - num;
            if (!map.containsKey(other))
                continue;
            int valFreq = map.get(num);
            int valFreq2 = map.get(other);

            if(num<other){
               count = count + valFreq * valFreq2;
            } else if(num == other){
                 count = count + valFreq * (valFreq - 1) / 2;
            }

        }
        return count;
    }
}
