package hashing;

import java.util.HashMap;

public class DisjointArrays {

    public static boolean isDisjoit(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            list.put(arr1[i], 1);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (list.containsKey(arr2[j])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] a = {12, 34, 11, 9, 3};
        int[] b = {7, 2, 1, 5};
        System.out.println(isDisjoit(a, b));
    }
}
