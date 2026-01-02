package searching;

public class SecondLargestElement {

    public static int secondLargestElement(int[] arr){
        int max1,max2;
        max1 =max2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1= arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max1 && arr[i]>max2){
                max2 = arr[i];
            }
        }
        return  max2;

    }
    public static void main(String[] args) {
        int[] arr ={12,45,89,78,23};
        System.out.println(secondLargestElement(arr));

    }
}
