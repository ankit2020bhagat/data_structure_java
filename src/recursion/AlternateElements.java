package recursion;

public class AlternateElements {

    public static void  fun(int[] arr,int i,int n){
        if(i>n){
            return;
        }
        System.out.print(arr[i]+" ");
        fun(arr,i+2,n);
    }

    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8};
        fun(arr,0,arr.length-1);
    }
}
