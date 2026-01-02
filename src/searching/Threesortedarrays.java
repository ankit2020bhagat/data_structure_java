package searching;

import java.util.ArrayList;
import java.util.HashSet;

public class Threesortedarrays {
    public static HashSet<Integer> findCommon(int[] arr1, int[] arr2, int[] arr3){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
              res.add(arr2[i]);
            }
        }
        HashSet<Integer> res1 = new HashSet<>();
        for(int i=0;i<arr3.length;i++){
            if(res.contains(arr3[i])){
                res1.add(arr3[i]);
            }
        }
        return res1;
    }
    public static void main(String[] args) {
        int[] arr1 ={2,34,56,89,45};
        int[] arr2 ={34,56,67,89};
        int[] arr3={56,7,89,6};

        System.out.println(findCommon(arr1,arr2,arr3));
    }

}
