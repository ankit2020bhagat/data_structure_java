package recursion;

public class ArrayisSorted {

    public static boolean isSorted(int[] arr ,int n){
        if(n==1 ||n ==0){
            return true;
        }
        return arr[n-1]>=arr[n-2] || isSorted(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50};
        boolean res  = isSorted(arr,arr.length);
        System.out.println(res);

    }
}
