public class Floor {

    //return the index greater number <= target
    static int floor(int[] arr, int target){
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
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = floor(arr,15);
        System.out.println(ans);
    }

}
//definition - greater element that is smaller or equal to a target element