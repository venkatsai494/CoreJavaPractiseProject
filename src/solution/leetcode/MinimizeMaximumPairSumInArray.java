package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimizeMaximumPairSumInArray {
    public static void main(String[] args) {
        MinimizeMaximumPairSumInArray minimizeMaximumPairSumInArray = new MinimizeMaximumPairSumInArray();
        System.out.println(minimizeMaximumPairSumInArray.minPairSum(new int[]{3,5,2,3}));//7
        System.out.println(minimizeMaximumPairSumInArray.minPairSum(new int[]{3,5,4,2,4,6}));//8
    }
    public int minPairSum(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<l/2; i++){
            list.add(nums[i]+nums[l-i-1]);
        }
        list.sort(Collections.reverseOrder());
        return list.getFirst();
    }
}
