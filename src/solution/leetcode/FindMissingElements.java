package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {
    public static void main(String[] args) {
        FindMissingElements solution = new FindMissingElements();
        System.out.println(solution.findMissingElements(new int[]{1,4,2,5})); // [3]
        System.out.println(solution.findMissingElements(new int[]{7,8,6,9})); // []
        System.out.println(solution.findMissingElements(new int[]{5,1})); // [2,3,4]
    }
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for(int i: nums){
            numList.add(i);
        }
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int start = nums[0];
        int end = nums[nums.length-1];
        for(int i = start; i<end; i++){
            if(!numList.contains(i)) result.add(i);
        }
        return result;
    }
}
