package sorting;

import java.util.Arrays;

public class Findmissingelements {

    public static int findMissing(int[] arr, int key, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                return findMissing(arr, key, mid + 1, right);
            } else {
                return findMissing(arr, key, left, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 11, 51, 15};
        Arrays.sort(arr);
//        for(int data:arr){
//            System.out.println(data);
//        }
        int low = 50;
        int high = 55;
        for (int i = low; i <= high; i++) {
            int res = findMissing(arr, i, 0, arr.length - 1);
            if (res == -1) {
                System.out.println("res :" + i);
            }

        }
    }
}
