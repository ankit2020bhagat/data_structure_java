package array;

import java.util.HashSet;

public class DuplicatewithinK {

    public static boolean duplicateWith(int[] arr,int k){
        for(int i=0;i<=k;i++){

            for(int j=i+1;j<arr.length-k+i-1;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean usingHashset(int[] arr ,int k){
        HashSet<Integer> list = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){

                return true;
            }
            else{
                list.add(arr[i]);
                if(i>=k){

                    list.remove(i-k+1);

                }
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,1,2,3,4};
        System.out.println(duplicateWith(arr,3));
        System.out.println(usingHashset(arr,3));
    }
}
