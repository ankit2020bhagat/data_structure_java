package twoPointer;

import java.util.Arrays;

public class TwoSum {
    public static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (right > left) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(twoSum(arr, 4));

    }
}
