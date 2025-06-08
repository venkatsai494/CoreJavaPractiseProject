package solution.leetcode;

import java.util.Arrays;

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        MaximumIceCreamBars micb = new MaximumIceCreamBars();
        System.out.println(micb.maxIceCream(new int[]{1,3,2,4,1}, 7)); // 4
        System.out.println(micb.maxIceCream(new int[]{10,6,8,7,7,8}, 5)); // 0
        System.out.println(micb.maxIceCream(new int[]{1,6,3,1,2,5}, 20)); // 6
    }
    public int maxIceCream(int[] costs, int coins) {
        int output = 0;
        Arrays.sort(costs);
        for(int cost: costs){
            if(coins>=cost){
                output++;
                coins -=cost;
            }
            else{
                break;
            }
        }
        return output;
    }
}
