package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kthsmallestelement {

    public static int findKth(int[][] arr,int k){
        int n=arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k);
    }

    public static void main(String[] args) {
        int[][] mat ={{10, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 37, 48},
                {32, 33, 39, 50}};

        int k=3;
        System.out.println(findKth(mat,2));

    }
}
