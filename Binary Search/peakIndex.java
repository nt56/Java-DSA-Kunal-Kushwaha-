public class peakIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,2};
        System.out.println(findIndex(arr));
    }

    public static int findIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            //find the middle element
            int mid = start + (end - start) / 2;

            //comparison
            if(arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // because we know that mid+1 element > mid element
                start = mid + 1;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}
