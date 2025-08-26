package solution.leetcode;

import java.util.Arrays;

public class MinimumCostToReachEveryPosition {
    public static void main(String[] args) {
        MinimumCostToReachEveryPosition mrcp = new MinimumCostToReachEveryPosition();
        System.out.println(Arrays.toString(mrcp.minCosts(new int[]{5,3,4,1,3,2})));
        System.out.println(Arrays.toString(mrcp.minCosts(new int[]{1,2,4,6,7})));
    }
    public int[] minCosts(int[] cost) {
        for(int i = 1; i < cost.length; i++) {
            if(cost[i] > cost[i - 1]) {
                cost[i] = cost[i - 1];
            }
        }
        return cost;
    }
}
