import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 66;   //if you make a change to the object via this ref variable, the same object will be changed
    }
}
