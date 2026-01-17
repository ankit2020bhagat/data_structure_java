package array;

public class MaximumCircular {

    public static void maxiumStatic(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                int indx = (i+j)%n;
                sum+=arr[indx];
                maxSum = Math.max(maxSum,sum);
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr ={8, -8, 9, -9, 10, -11, 12};
        maxiumStatic(arr);
    }
}
