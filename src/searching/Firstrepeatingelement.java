package searching;

import java.util.HashSet;

public class Firstrepeatingelement {

    public static int findRepeating(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return arr[i];
            }
            else{
                set.add(arr[i]);
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr ={7,6,7,3,2,5};
        System.out.println(findRepeating(arr));
    }
}
