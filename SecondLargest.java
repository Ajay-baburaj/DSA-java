
public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int [] arr1 = {10, 5, 10};
        int[] arr3 = {10, 10, 10};
        int num = getSecondLargest(arr3);
        System.out.println(num);

    }

    public static int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}