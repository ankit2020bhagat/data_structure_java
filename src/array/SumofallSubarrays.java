package array;

public class SumofallSubarrays {

    public static int sumAllsubarrays(int[] arr){
        int sum =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum+=(arr[i]*(i+1)*(n-i));
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1, 4, 5, 3, 2};
        System.out.println(sumAllsubarrays(arr));
    }
}
