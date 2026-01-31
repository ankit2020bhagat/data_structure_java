package array;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;

public class FindAllPairs {

    public static ArrayList<ArrayList<Integer>> findAllPair(int[] arr,int target){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                ArrayList<Integer> res = new ArrayList<>();
                if(target ==arr[i]+arr[j]){
                   res.add(i);
                   res.add(j);
                   ans.add(res);
                }
            }
        }
        return ans;
    }

   public static void main(String[] args){
       int[] arr ={10, 20, 30, 20, 10, 30};
       ArrayList<ArrayList<Integer>> res = findAllPair(arr,50);
       System.out.println(res);
   }
}
