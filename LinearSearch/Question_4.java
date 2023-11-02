//Q-Find minimum element in an array

public class Question_4 {

    public static int minElement(int[] arr){

        if(arr.length == 0)
            return -1;

        int min = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }

        return min;

    }

    public static void main(String[] args) {

        int[] arr = {23,45,1,2,8,19,-3,16,-11,28};
        int ans = minElement(arr);
        System.out.println("Minimum Element : "+ans);

    }

}
