package array;

import java.util.Map;

public class MaximumSubarraySum {


    public static int maxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
        return  max;
    }

    public static int kandane(int[] arr){
        int maxEnding = arr[0];
        int maxSum = arr[0];
        for(int i=1;i<arr.length;i++){

            maxEnding+=arr[i];
            if(maxEnding<0){
                i++;
                maxEnding= arr[i];
                maxSum = arr[i];
            }
            maxSum = Math.max(maxSum,maxEnding);

        }
        System.out.println(maxSum);
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr ={2, 3, -8, 7, -1, 2, 3};
        maxSum(arr);System.out.println();
        kandane(arr);
    }
}
