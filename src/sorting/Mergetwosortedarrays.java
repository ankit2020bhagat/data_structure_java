package sorting;

import java.util.ArrayList;

public class Mergetwosortedarrays {

    public static void mergeTowArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res.add(arr1[i]);
                i++;
            } else {
                res.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            res.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            res.add(arr2[j]);
            j++;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        mergeTowArray(arr1, arr2);
    }
}
