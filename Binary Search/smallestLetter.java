public class smallestLetter {

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //comparison
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(arr,target));
    }
}
