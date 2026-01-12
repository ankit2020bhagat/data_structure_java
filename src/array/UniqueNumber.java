package array;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {
    public static int uniqueNumber(int[] arr){
        HashMap<Integer,Integer> list = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(list.containsKey(arr[i])){
                list.put(arr[i],list.getOrDefault(arr[i],0)+1);
            }else{
                list.put(arr[i],1);
            }
        }
        int result =0;
        for(Map.Entry<Integer,Integer> res:list.entrySet()){
            if(res.getValue()==1){
                 result = res.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr ={2, 3, 5, 4, 5, 3, 4};
        System.out.println(uniqueNumber(arr));
    }
}
