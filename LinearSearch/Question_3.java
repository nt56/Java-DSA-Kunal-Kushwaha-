//Q-search in given range

public class Question_3 {

    public static int searchInRange(int[] arr, int target, int start, int end){

        if(arr.length == 0)
            return -1;

        for(int i=start; i< end; i++){
            int element = arr[i];
            if(element == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 16;
        int ans = searchInRange(arr,target,4,8);
        System.out.println(ans);
    }

}
