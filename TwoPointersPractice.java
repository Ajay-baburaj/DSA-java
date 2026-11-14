import java.util.Arrays;

public class TwoPointersPractice {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3 };
        int count = removeDuplicates(arr);
        System.out.println(count);
        System.out.print(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int slowPointer = 0;
        int fastPointer = 1;

        while (fastPointer < arr.length) {
            if (arr[slowPointer] != arr[fastPointer]) {
                arr[slowPointer + 1] = arr[fastPointer];
                slowPointer++;
            }
            fastPointer++;
        }
        return slowPointer + 1;
    }

}
