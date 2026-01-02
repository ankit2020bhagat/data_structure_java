package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sortevenplaced {
    public static ArrayList sortEvenOdd(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(even);
        res.addAll(odd);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 6, 7};
        ArrayList<Integer> res = sortEvenOdd(arr);
        System.out.println(res);


    }
}
