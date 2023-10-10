import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println("Before Swapping : "+ Arrays.toString(arr));

        swap(arr, 0, 3);
        System.out.println("After Swapping : "+ Arrays.toString(arr));
    }
    static  void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
//above code for swapping two elements in an array