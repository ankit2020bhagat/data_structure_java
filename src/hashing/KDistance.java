package hashing;

import java.util.HashMap;

public class KDistance {
    public static boolean kdiastance(int[] arr, int k) {
        HashMap<Integer, Integer> list = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (list.containsKey(arr[i])) {
                if (i - list.get(arr[i]) <= k) {
                    return true;
                }
            } else {
                list.put(arr[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(kdiastance(a, 3));

    }
}
