package array;

import java.util.ArrayList;
import java.util.Collections;

public class Rearrangeanarray {

    public static int[] reArrange(int[] arr){
        int n=arr.length;
        ArrayList<Integer> arrayList = new ArrayList<>(Collections.nCopies(n,-1));
        for(int i=0;i<n;i++){
          if(arr[i]!=-1){
              arrayList.set(arr[i],arr[i]);
          }
        }
        for(int i=0;i<n;i++){
            arr[i] = arrayList.get(i);
        }
        return arr;
    }

    public static int[] arrangeArray(int[] arr){
        int n= arr.length,i=0;

        while(i<n ){
            if(arr[i]==i){
                i++;
            } else if (arr[i]!=-1) {
                System.out.println(arr[i]);
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                arr[arr[i]]= temp;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] res =arrangeArray(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
