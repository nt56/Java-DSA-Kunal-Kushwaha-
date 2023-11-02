//Q - Find Wealthiest Person

public class Question_10 {

    public static int maxWealth(int[][] accounts){

        //person - row
        //accounts - col
        int max = Integer.MIN_VALUE;

        for(int person=0; person< accounts.length; person++){
            //when you start a new col take a new sum for that row
            int sum = 0;
            for(int account=0; account<accounts[person].length; account++){
                sum = sum + accounts[person][account];
            }
            //now we have a sum of accounts of person check with overall ans
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {1,1,2},
                {2,3,5},
                {2,2,2}
        };
        System.out.println(maxWealth(accounts));
    }

}
