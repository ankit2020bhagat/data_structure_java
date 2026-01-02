package searching;

import java.util.HashMap;

public class MissingNumber {
    public static int missingNumber(int[] arr){
        HashMap<Integer,Integer> list = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            list.put(arr[i],1);
        }
        int missingNUmber=-1;
        for(int i=0;i<=arr.length+1;i++){
            if(!list.containsKey(i)){
                missingNUmber =i;
            }
        }
        return missingNUmber;
    }
    public static void main(String[] args) {
        int[] arr ={8,3,5,7,2,4,1};
        System.out.println(missingNumber(arr));

    }
}
