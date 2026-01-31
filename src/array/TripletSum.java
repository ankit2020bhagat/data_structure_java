package array;

public interface TripletSum {

    public static boolean tripletSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                for(int k =j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        return true;
                    }
                }
            }
        }
        return  false;
    }

    public static void main(String[] args){
        int[] arr ={1, 4, 45, 6, 10, 8};
        System.out.println(tripletSum(arr,15));
    }
}
