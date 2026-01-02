package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Pairsuminsortedarray {
    public static int binarySearch(int[] arr, int key, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key > arr[mid]) {
                return binarySearch(arr, key, mid + 1, right);
            }
            return binarySearch(arr, key, left, mid - 1);
        }
        return -1;
    }


    public static ArrayList pairSum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            int res = binarySearch(arr, complement, 0, arr.length - 1);
            if (res != -1) {
                list.add(i);
                list.add(res);
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 10;
        ArrayList<Integer> res = pairSum(arr, target);
        System.out.println(res);
    }

}
