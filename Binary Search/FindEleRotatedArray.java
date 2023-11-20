public class FindEleRotatedArray {

    //this will not work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            //4cases for finding pivot
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] > start){
                return mid-1;
            } else {
                return mid+1;
            }
        }
        return -1;
    }

    //normal binary search
    static int binarySearch(int[] arr, int target, int start, int end){
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
        return -1;
    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        // if you did not find a pivot, it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(arr,target,0,arr.length-1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }

        return binarySearch(arr,target,pivot+1, arr.length)-1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        System.out.println(search(arr,3));
    }
}
