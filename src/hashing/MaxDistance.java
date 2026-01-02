package hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxDistance {

    public static void maxDistance(int[] arr) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.containsKey(arr[i])) {
                int dis = i - list.get(arr[i]);
                

            } else {
                list.put(arr[i], i);
            }
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> e : list.entrySet()) {
            max = Math.max(max, e.getValue());
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        maxDistance(arr);
    }
}
