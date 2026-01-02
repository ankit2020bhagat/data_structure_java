package searching;



import java.util.ArrayList;

import java.util.HashSet;

public class MissingandRepeating {

    public static void missingAndRepeating(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
               list.add(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr ={4,3,6,2,1,1};
        missingAndRepeating(arr);
    }
}
