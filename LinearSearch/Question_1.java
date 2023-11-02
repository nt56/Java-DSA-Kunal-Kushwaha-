//Q-Search The element in an array

public class Question_1 {

    public static int linearSearch(int[] arr, int target){

        if(arr.length == 0)
            return -1;

        for(int i=0; i< arr.length; i++){
            int element = arr[i];
            if(element == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 16;
        int ans = linearSearch(arr,target);
        System.out.println(ans);

    }
}
