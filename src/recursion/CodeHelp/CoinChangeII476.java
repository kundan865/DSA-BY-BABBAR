package recursion.CodeHelp;

public class CoinChangeII476 {
    static int change(int[] coins,int index,int amount){

        if(index >= coins.length){
            return 0;
        }

        if (amount == 0){
            return 1;
        }

        if(amount < 0){
            return -1;
        }

        // include Answer
        int includeAns = change(coins,index,amount - coins[index]);

        // exclude Answer
        int excludeAns = change(coins,index+1,amount);

        int finalAns = includeAns +excludeAns;

        return finalAns;
    }
    public static void main(String[] args) {
//        int []coins = {1,2,5};
        int []coins = {3};
        int index = 0;
        int amount = 2;
        int ans = change(coins,index,amount);
        System.out.println("answer = "+ans);
    }
}
