package searching;

public class BinarySearch {
    public static int binarySearch(int[] arr,int left,int right,int key){
        if(right>=left){
            int mid = left +(right-left)/2;
            if(arr[mid] == key){
                return mid;
            }
             if(key>arr[mid]){
                return binarySearch(arr,mid+1,right,key);
            }
             return binarySearch(arr,left,mid-1,key);
        }

        return -1;

    }
    public static void main(String[] args) {
       int[] arr ={2,3,7,9,34,67,89};
       int res = binarySearch(arr,0,arr.length-1,67);
        System.out.println(res);
    }
}
