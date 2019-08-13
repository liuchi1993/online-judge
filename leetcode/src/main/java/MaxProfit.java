/**
 * @Author: liuchi
 * @Date: 2019/8/13 22:51
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 0){
            return 0;
        }
        int soFarMin = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[soFarMin] > prices[i]){
                soFarMin = i;
            }else {
                maxProfit = Math.max(maxProfit, prices[i] - prices[soFarMin]);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit.maxProfit(prices1));
        System.out.println(maxProfit.maxProfit(prices2));
    }
}
