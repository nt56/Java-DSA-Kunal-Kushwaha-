//Q-Search the character in String

public class Question_2 {

    public static boolean searchChar(String str, char target){

        if(str.isEmpty())
            return false;

        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "Nagbhushan";
        char target = 'b';
        System.out.println(searchChar(str,target));
    }

}
