package array;


import java.util.Arrays;

public class MissingNumber {

    public static  int miassingNumber(int[] arr){
        Arrays.sort(arr);
        int i;
        for( i=1;i<=arr.length;i++){
            if(arr[i-1]!=i){
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int [] arr ={6, 2, 4, 5, 3, 7, 1};
        System.out.println(miassingNumber(arr));
    }
}
