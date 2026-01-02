package sorting;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {

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

    public static void intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int val : arr1) {
            set1.add(val);
        }
//        for (int val : arr2) {
//            set2.add(val);
//        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int data : set1) {
            int res = binarySearch(arr2, data, 0, arr2.length - 1);
            if (res != -1) {
                result.add(data);
            }
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 4};
        int[] arr2 = {5, 6};
        intersection(arr1, arr2);

    }
}
