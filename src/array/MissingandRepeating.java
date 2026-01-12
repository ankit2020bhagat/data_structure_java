package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingandRepeating {

    public static ArrayList missingAndRepeating(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(map.get(arr[i]),0)+1);
            }else {
                map.put(arr[i],1);
            }
        }

        for(int i=1;i<=arr.length;i++){
            if(map.containsKey(i)){
                continue;
            }else {
                map.put(i,0);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> list: map.entrySet()){
            if(list.getValue()>1 || list.getValue()==0){
                res.add(list.getKey());
            }
//            System.out.print(list.getKey()+" "+list.getValue());
//            System.out.println();
        }

        return  res;

    }

    public static void main(String[] args) {
        int[] arr ={4, 3, 6, 2, 1, 1};
        ArrayList<Integer> res =missingAndRepeating(arr);
        System.out.println(res);
    }
}
