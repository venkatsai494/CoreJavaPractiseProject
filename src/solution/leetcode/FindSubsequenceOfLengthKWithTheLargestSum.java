package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubsequenceOfLengthKWithTheLargestSum {
    public static void main(String[] args) {
        FindSubsequenceOfLengthKWithTheLargestSum obj = new FindSubsequenceOfLengthKWithTheLargestSum();
        System.out.println(Arrays.toString(obj.maxSubsequence(new int[]{2,1,3,3},2)));
        System.out.println(Arrays.toString(obj.maxSubsequence(new int[]{-1,-2,3,4},3)));
        System.out.println(Arrays.toString(obj.maxSubsequence(new int[]{3,4,3,3},2)));
        System.out.println(Arrays.toString(obj.maxSubsequence(new int[]{50,-75},2)));
    }
    public int[] maxSubsequence(int[] nums, int k) {
        int [] result = new int[k];
        List<Integer> list = new ArrayList<>();
        int[] tempArray = new int[nums.length];
        System.arraycopy(nums, 0, tempArray, 0, nums.length);
        Arrays.sort(nums);
        for(int i = nums.length-k; i<nums.length; i++){
            list.add(nums[i]);
        }
        int j = 0;
        for(int i: tempArray){
            if(list.contains(i)){
                result[j] = i;
                list.remove(Integer.valueOf(i));
                j++;
            }
        }
        return result;
    }
}
