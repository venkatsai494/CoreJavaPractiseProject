package solution.leetcode;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityOfRocks {
    public static void main(String[] args) {
        MaximumBagsWithFullCapacityOfRocks obj = new MaximumBagsWithFullCapacityOfRocks();
        System.out.println(obj.maximumBags(new int[]{2,3,4,5}, new int[]{1,2,4,4}, 2)); // 3
        System.out.println(obj.maximumBags(new int[]{10,2,2}, new int[]{2,2,0}, 100)); // 3
    }
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        int[] diff = new int[rocks.length];
        for(int i = 0; i<diff.length; i++){
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        for(int i: diff){
            if(additionalRocks>=i){
                additionalRocks = additionalRocks - i;
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
