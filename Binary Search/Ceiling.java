public class Ceiling {

    //return the index of smallest number >= target
    static int ceil(int[] arr, int target){

        //but what if the target is greater than the greatest number in array
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //find the middle element
            int mid = start + (end - start) / 2;

            //comparison
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //found answer
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = ceil(arr,15);
        System.out.println(ans);
    }

}
//definition - smallest number that is greater than or equal to target number