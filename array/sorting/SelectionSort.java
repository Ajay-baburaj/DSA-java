import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] inp = { 5, 3, 4, 1, 2, 6 };
        int[] result = selectionSort(inp);
        System.out.println(Arrays.toString(result));

    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int largest = largestElement(arr, 0, last);
            swap(arr, largest, last);
        }
        return arr;
    }

    public static int largestElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
}
