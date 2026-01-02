//package searching;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class PairSumClosest {
//
//    public ArrayList pairSum(int[] arr,int target){
//        int sum;
//        int minDiff =Integer.MAX_VALUE;
//        for(int i=0;arr.length;i++){
//            ArrayList<Integer> res = new ArrayList<>();
//            for(int j=i+1;j<arr.length;j++){
//                int currDiff = Math.abs(arr[i]-arr[j]);
//                if(currDiff<minDiff){
//                    minDiff = currDiff;
//                    res = new ArrayList<>(Arrays.asList(arr[i],arr[j]));
//                }
//                else if(currDiff == minDiff ){
//
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr ={5, 2, 7, 1, 4};
//        int target = 10;
//    }
//}
