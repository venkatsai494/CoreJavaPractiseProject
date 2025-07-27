package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();
        System.out.println(solution.findDifference(new int[]{1, 2, 3}, new int[] {2, 4, 6}));//[[1, 3], [4, 6]]
        System.out.println(solution.findDifference(new int[]{1,2,3,3}, new int[] {1,1,2,2}));//[[3], []]
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        for(int num: nums1){
            if(Arrays.stream(nums2).noneMatch(t->t==num) && !result2.contains(num)){
                result2.add(num);
            }
        }
        for(int num: nums2){
            if(Arrays.stream(nums1).noneMatch(t->t==num) && !result1.contains(num)){
                result1.add(num);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(result2);
        result.add(result1);
        return result;
    }

}
