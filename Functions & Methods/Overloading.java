public class Overloading {

    public static void main(String[] args) {
        fun(1);
        fun("abc");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String s){
        System.out.println(s);
    }

}
//same name with different parameters. happens at compile time