package hashing;

import java.util.HashMap;
import java.util.Map;

public class Mostfrequent {

    public static void mostFrequent(int[] arr) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.containsKey(arr[i])) {
                int count = list.get(arr[i]);
                count++;
                list.put(arr[i], count);
            } else {
                list.put(arr[i], 1);
            }
        }
        int curMax = Integer.MIN_VALUE;
        int curVa = 0;
        for (Map.Entry<Integer, Integer> e : list.entrySet()) {
            if (curMax == e.getValue()) {
                curVa = Math.max(curVa, e.getKey());
            }
            if (curMax < e.getValue()) {
                curMax = e.getValue();
                curVa = e.getKey();
            }

        }
        System.out.println(curVa);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 20, 30, 20, 20};
        mostFrequent(arr);
    }
}
