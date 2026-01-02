package hashing;

import java.util.HashMap;

public class Arraysareequal {

    public static boolean arrayareEqual(int[] a, int[] b) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!list.containsKey(a[i])) {
                list.put(a[i], 1);
            } else {
                int count = list.get(a[i]);
                count++;
                list.put(a[i], count);

            }
        }

        for (int i = 0; i < b.length; i++) {

            if (!list.containsKey(b[i])) {
                return false;
            }
            if (list.get(b[i]) == 0) {
                return false;
            }
            int count = list.get(b[i]);
            count--;
            list.put(b[i], count);

        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 2, 5, 2};
        int[] b = {2, 3, 3, 5, 2};
        System.out.println(arrayareEqual(a, b));
    }
}


