package array;

import java.util.Arrays;

public class Sum3 {

    public static boolean binarySearch(int[] arr,int key,int left,int right){
        if(right>=left){
            int mid = (right+left)/2;
            if(arr[mid] == key){
                return true;
            }
            if(key>arr[mid]){
               return binarySearch(arr,key,mid+1,right);
            }
            else{
               return binarySearch(arr,key,left,mid-1);
            }
        }
        return false;
    }

    public static boolean sum3(int[] arr,int target){
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int requiredSum = target - arr[i];
            int right=arr.length-1,left=i+1;
            while (right>left){
                if(arr[left]+arr[right] == requiredSum){
                    return true;
                }
                if(arr[left]+arr[right]<requiredSum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }


        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(sum3(arr,13));

    }
}
