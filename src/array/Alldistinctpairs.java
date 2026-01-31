package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alldistinctpairs {

    public static List<List<Integer>> alldistinctPair1(int[] arr,int target){
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int left=0 ,right=arr.length-1;
        while(right>left){

            if(left>0 && arr[left] == arr[left-1]){
                left++;
                continue;
            }
            if(right<arr.length-1 && arr[right]== arr[right+1]){
                right--;
                continue;
            }

            if(arr[right]+arr[left]==target){
                 res.add(Arrays.asList(arr[left],arr[right]));
                 left++;
                 right--;
            }
            else if(arr[right]+arr[left]>target){
                right--;
            }else {
                left++;
            }
        }
        return res;
    }


    public static List<List<Integer>> alldistinctPair(int[] arr,int target){

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(target == arr[i]+arr[j]){
                    int min = Math.min(arr[i],arr[j]);
                    int max= Math.max(arr[i],arr[j]);

                    List<Integer> res = new ArrayList<>();
                    res.add(min);
                    res.add(max);
                    if(!ans.contains(res)){
                        ans.add(res);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr ={1,-1, 5, 7, -1, 5,7};
//        List<List<Integer>> res = alldistinctPair(arr,6);
//        System.out.println(res);
        List<List<Integer>> res = alldistinctPair1(arr,6);
        System.out.println(res);
    }
}
