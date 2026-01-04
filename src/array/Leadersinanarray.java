package array;

import java.util.ArrayList;
import java.util.Collections;

public class Leadersinanarray {

    public static ArrayList leaderinArray(int[] arr){
         int n =arr.length-1;
        int max = arr[n];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(max);
        for(int i=n;i>=0;i--){
            if(max<arr[i]){
                max = arr[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;

    }
    public static void main(String[] args) {
        int[] arr ={ 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> res = new ArrayList<>();
        res = leaderinArray(arr);
        for(int data:res){
            System.out.print(data+" ");
        }
    }
}
