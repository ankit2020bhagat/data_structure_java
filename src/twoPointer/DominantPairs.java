package twoPointer;

import java.util.ArrayList;
import java.util.Collections;

public class DominantPairs {
    public static void domaintPair(int[] arr) {
        int mid = (arr.length) / 2;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            left.add(arr[i]);
        }
        Collections.sort(left);
//        System.out.println(left);

        for (int j = mid; j < arr.length; j++) {
            right.add(arr[j]);
        }
        Collections.sort(right);
//        System.out.println(right);
        int count = 0;
        for (int i = 0; i < left.size(); i++) {
            for (int j = 0; j < right.size(); j++) {
                if (left.get(i) >= 5 * right.get(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 2, 1, 1, 2};

        domaintPair(arr);

    }
}
