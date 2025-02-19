package solution.leetcode;

public class FinalPricesWithSpecialDiscountInAShop {

    public static void main(String[] args) {
        FinalPricesWithSpecialDiscountInAShop fp = new FinalPricesWithSpecialDiscountInAShop();
        int [] prices = {8,4,6,2,3};
        int [] result = fp.finalPrices(prices);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public int[] finalPrices(int[] prices) {
        for(int i = 0; i<prices.length; i++){
            int j = i+1;
            while(j<prices.length){
                if(prices[i]>=prices[j]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
                j++;
            }
        }
        return prices;
    }
}
