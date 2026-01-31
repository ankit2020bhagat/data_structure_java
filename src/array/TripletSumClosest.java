package array;

import java.util.Arrays;

public class TripletSumClosest {

    public static int tripletSum1(int[] arr ,int target){
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE,res =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int left =i+1,right = arr.length-1;


            while (left<right){
                int currentSum = arr[left]+arr[right]+arr[i];
                int currDiff = Math.abs(target-currentSum);
                if(currDiff<diff){
                    if(currDiff == diff){

                        res =Math.max(res,currentSum);
                    }else {

                        res = currentSum;
                    }
                    diff =currDiff;

                }
                if(currentSum>target){
                    right--;
                }else {
                    left++;
                }
            }

        }
        return res;
    }

    public static int tripletSum(int[] arr, int target){
        int resDiff =Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int currentSum = arr[i]+arr[j]+arr[k];
                    int currentDiff = Math.abs(target-currentSum);
                    if(currentDiff<=resDiff){
                        if(currentDiff == resDiff){
                            resDiff = currentDiff;
                            res = Math.max(res,currentSum);
                        }else {
                            resDiff = currentDiff;
                            res = currentSum;
                        }

                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr ={1, 10, 4, 5};
        int res = tripletSum(arr,10);
        System.out.println(res);
        System.out.println(tripletSum1(arr,10));

    }
}
