/**
 * @Author: liuchi
 * @Date: 2019/8/13 22:58
 */
public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 0){
            return 0;
        }
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]){
                maxProfit += (prices[i] - prices[i-1]);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit2 maxProfit2 = new MaxProfit2();
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit2.maxProfit(prices1));
        System.out.println(maxProfit2.maxProfit(prices2));
    }
}
