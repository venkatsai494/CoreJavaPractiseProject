package solution.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheDistinctDifferenceArray {
    public static void main(String[] args) {
        FindTheDistinctDifferenceArray obj = new FindTheDistinctDifferenceArray();
        System.out.println(Arrays.toString(obj.distinctDifferenceArray(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(obj.distinctDifferenceArray(new int[]{3,2,3,4,2})));
    }
    public int[] distinctDifferenceArray(int[] nums) {
        int [] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            Set<Integer> prefix = new HashSet<>();
            Set<Integer> suffix = new HashSet<>();
            for(int j = 0; j<=i; j++){
                prefix.add(nums[j]);
            }
            for(int j = i+1; j<nums.length; j++){
                suffix.add(nums[j]);
            }
            result[i] = prefix.size() - suffix.size();
        }
        return result;
    }
}
