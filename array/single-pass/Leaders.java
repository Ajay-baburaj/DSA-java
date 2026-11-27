import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 2, 4, 1 };
        int[] arr1 = { 16, 17, 4, 3, 5, 2 };
        int[] arr2 = { 1, 2, 3, 4 };

        ArrayList<Integer> arrList = leaders(arr2);
        System.out.println(arrList);
    }

    public static ArrayList<Integer> leaders(int[] arr) {
        int n = arr.length - 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int maxRight = 0;
        while (n >= 0) {
            if (arr[n] >= maxRight) {
                maxRight = arr[n];
                arrayList.add(maxRight);
            }
            n--;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

}
