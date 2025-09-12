package solution.leetcode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        System.out.println(b.maxProfit(new int[]{7,1,5,3,6,4})); //5
        System.out.println(b.maxProfit(new int[]{7,6,4,3,1})); //0
        System.out.println(b.maxProfit(new int[]{1,2})); //1
        System.out.println(b.maxProfit(new int[]{2,1})); //0
        System.out.println(b.maxProfit(new int[]{3,2,6,5,0,3})); //4
    }
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxProfit;
    }
}
