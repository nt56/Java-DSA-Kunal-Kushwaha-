import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9);
        fun1("abc", "pqr", "lmn", "xyz" );
        mix(10,20,"abc", "pqr", "lmn");
    }

    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void fun1(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void mix(int a, int b, String ...s){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(s));
    }
}
