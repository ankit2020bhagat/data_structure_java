package searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Appearmorethan {

    public static ArrayList appearMore(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> data:map.entrySet()){
            if(data.getValue()>k){
                list.add(data.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr ={3, 4, 2, 2, 1, 2, 3, 3};
        System.out.println(appearMore(arr,2));
    }
}
