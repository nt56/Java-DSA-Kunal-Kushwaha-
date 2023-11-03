public class OrderAgonsticBS {

    static int orderAgonsticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find weather the array is ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        //logic for finding element
        while(start <= end){

            //find mid
            int mid = start + (end - start) / 2;

            //element found
            if(arr[mid] == target)
                return mid;

            //if an array is in ascending order
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99,88,77,66,55,44,33,22,11};
        int ans = orderAgonsticBS(arr,33);
        System.out.println(ans);
    }

}
