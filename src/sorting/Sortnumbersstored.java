package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sortnumbersstored {

    public static ArrayList sortnumber(int[] M1, int[] M2, int[] M3) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < M1.length; i++) {
            res.add(M1[i]);
        }
        for (int i = 0; i < M2.length; i++) {
            res.add(M2[i]);
        }

        for (int i = 0; i < M3.length; i++) {
            res.add(M3[i]);
        }
        Collections.sort(res);

        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] M1 = {23, 45, 78};
        int[] M2 = {12, 34, 65, 78};
        int[] M3 = {67, 89};
        sortnumber(M1, M2, M3);
    }
}
