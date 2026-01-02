package twoPointer;

public class MoveallZeros {

    public static int[] moveallZweors(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] res = moveallZweors(arr);
        for (int data : res) {
            System.out.print(data + " ");
        }
    }
}
