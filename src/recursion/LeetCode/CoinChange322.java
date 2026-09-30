package recursion.LeetCode;

public class CoinChange322 {
    static int coinChang(int [] coins,int index ,int amount){
        if(amount == 0){
            return  0;
        }
        if(index == coins.length){
            return Integer.MAX_VALUE;
        }

        int exclude = coinChang(coins,index+1,amount);

        int include = Integer.MAX_VALUE;

        if(coins[index] <= amount){
            int result = coinChang(coins,index,amount - coins[index]);

            if(result!=Integer.MAX_VALUE){
                include = result + 1;
            }
        }
        return Math.min(include,exclude);
    }
    static int coinChang2(int [] coins,int amount){

        if(amount == 0){
            return  0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;

        for(int coin : coins){
            int recursionAns = coinChang2(coins,amount  - coin);

            if(recursionAns != Integer.MAX_VALUE){
                int totalCoinUsed = recursionAns + 1;

                mini = Math.min(mini,totalCoinUsed);
            }
        }
        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
    public static void main(String[] args) {
        int [] coins ={1,2,5};
        int amount = 11;
        int index = 0;
        int ans = coinChang(coins,index, amount);

        if(ans == Integer.MAX_VALUE){
            ans = -1;
        }

        System.out.println("ans = "+ans);

        int ans2 = coinChang2(coins, amount);

        System.out.println("ans2 = "+ans2);
    }
}
