
public class RemoveDuplicatesAgain {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 3,4,4,5,5 };
        int count = removeDuplicates(arr);
        System.out.println(count);

    }

    public static int removeDuplicates(int[] arr) {
        int slow = 0;
        int fast = slow + 1;

        while (fast <= arr.length - 1) {
            if (arr[slow] != arr[fast]) {
                arr[slow + 1] = arr[fast];
                slow++;
            }
            fast++;

        }
        return slow + 1;

    }
}
