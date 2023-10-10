import java.util.Arrays;

public class MaxElement {

    public static void main(String[] args) {

        int[] arr = {11,55,6,8,90,4,8};
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));

        System.out.println(maxRange(arr,1,3));
    }

    //traversing to the whole array
    static int max(int[] arr){
        int maxEle = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }
        return maxEle;
    }

    //traversing to the whole array
    static int maxRange(int[] arr, int start, int end){
        int maxEle = arr[0];
        for(int i=start; i<=end; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
}
