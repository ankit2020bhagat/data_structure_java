package array;

public class Removeduplicates {

    public static int  removeDuplicate(int[] arr){
        int idx =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr ={1, 2, 2, 3, 4, 4, 4, 5, 5};
        int res = removeDuplicate(arr);
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
