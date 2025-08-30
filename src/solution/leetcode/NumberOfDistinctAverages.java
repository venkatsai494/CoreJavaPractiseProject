package solution.leetcode;

import java.util.Arrays;

public class NumberOfDistinctAverages {
    public static void main(String[] args) {
        NumberOfDistinctAverages n = new NumberOfDistinctAverages();
        System.out.println(n.distinctAverages(new int[]{4,1,4,0,3,5})); //2
        System.out.println(n.distinctAverages(new int[]{1,100})); //1
        System.out.println(n.distinctAverages(new int[]{9,5,7,8,7,9,8,2,0,7})); //5
    }
    public int distinctAverages(int[] nums) {
        int len = nums.length/2;
        double [] arr = new double[len];
        Arrays.sort(nums);
        for(int i = 0; i <len; i++){
            arr[i] = ((double)(nums[i] + nums[2*len -1 - i]))/2;
        }
        return (int)Arrays.stream(arr).distinct().count();
    }
}
