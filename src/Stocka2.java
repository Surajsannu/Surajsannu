public class Stocka2 {
    public static void main(String[] args) {
        int[]prices  =  {7,1,5,3,6,4};
        System.out.println(maxprofit(prices));
    }

    public  static int maxprofit(int[] prices) {
        // buy on day 1 = 1, sell on day 3 = 5 total 5-1 =4, again buy on day 4 3 and s
        // sell on day 5 total 6-3=3 total 5+3=7;
        int maxProfit =0;
        for(int i =1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}
