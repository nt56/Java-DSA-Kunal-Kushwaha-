//Q-Find maximum element in an array

public class Question_5 {

    public static int maxElement(int[] arr){

        if(arr.length == 0)
            return -1;

        int max = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }

        return max;

    }

    public static void main(String[] args) {

        int[] arr = {23,45,1,2,8,19,-3,16,-11,28};
        int ans = maxElement(arr);
        System.out.println("Maximum Element : "+ans);

    }

}
