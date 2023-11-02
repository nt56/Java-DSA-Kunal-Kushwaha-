//Q-Find count of even number of digits in an array elements

public class Question_9 {

    //finding number
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num))
                count ++;
        }
        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;

//        if (numberOfDigits % 2 == 0){
//            return true;
//        }
//        return false;
    }

    //function for counting the digits
    static int digits(int num){
        if(num < 0)
            num = num * -1;

        if(num == 0)
            return 0;

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    //main function
    public static void main(String[] args) {
        int[] nums = {11,5684,5,963,58962};
        int ans = findNumbers(nums);
        System.out.println("Count : " +ans);
    }

}
