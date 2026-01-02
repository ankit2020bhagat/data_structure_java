package hashing;

import java.util.HashSet;

public class Arrayissubset {
    public static Boolean findSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> list = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!list.contains(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 43, 7, 1};
        System.out.println(findSubset(arr1, arr2));
    }
}
