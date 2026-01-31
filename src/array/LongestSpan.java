package array;

public class LongestSpan {

        public static int longestSpan(int[] arr,int[] arr1){
            int prefixsum1=0;
            int prefixsum2=0;
            int mmaxLength =0;
            for(int i=0;i<arr.length;i++){
                prefixsum1=arr[i];
                prefixsum2 =arr1[i];
                for(int j=i+1;j<arr.length;j++){
                    prefixsum1+=arr[j];
                    prefixsum2+=arr1[j];

                    if(prefixsum2 == prefixsum1){
                        mmaxLength = Math.max(mmaxLength,j-i+1);
                    }
                }
            }
            return  mmaxLength;
        }



    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 0, 0};
            int[] arr1 ={1, 0, 1, 0, 0, 1};
            int res =longestSpan(arr,arr1);
            System.out.println("res :"+res);

    }
    }


