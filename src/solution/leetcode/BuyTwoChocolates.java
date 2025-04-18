package solution.leetcode;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        BuyTwoChocolates btc = new BuyTwoChocolates();
        System.out.println(btc.buyChoco(new int[]{1,2,2},3));
    }
    public int buyChoco(int[] prices, int money) {
        int min = prices[0] + prices[1];
        for(int i = 0; i<prices.length-1; i++){
            for(int j = (i+1); j<prices.length; j++){
                min = Math.min(min, (prices[i] + prices[j]));
            }
        }
        if(min<=money) return (money-min);
        else return money;
    }
}
