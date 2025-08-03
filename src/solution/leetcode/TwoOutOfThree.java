package solution.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoOutOfThree {
    public static void main(String[] args) {
        TwoOutOfThree solution = new TwoOutOfThree();
        System.out.println(solution.twoOutOfThree(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3})); // [2, 3]
        System.out.println(solution.twoOutOfThree(new int[]{3, 1}, new int[]{2, 3}, new int[]{1, 2})); // [1, 2, 3]
        System.out.println(solution.twoOutOfThree(new int[]{1, 2, 2}, new int[]{4, 3, 3}, new int[]{5})); // []
    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i<nums1.length; i++){
            if(isNumberPresentInArray(nums2, nums1[i]) || isNumberPresentInArray(nums3, nums1[i])){
                output.add(nums1[i]);
            }
        }
        for(int i = 0; i<nums2.length; i++){
            if(isNumberPresentInArray(nums3, nums2[i]) || isNumberPresentInArray(nums1, nums2[i])){
                if(!output.contains(nums2[i]))  output.add(nums2[i]);
            }
        }
        for(int i = 0; i<nums3.length; i++){
            if(isNumberPresentInArray(nums1, nums3[i]) || isNumberPresentInArray(nums2, nums3[i])){
                if(!output.contains(nums3[i]))  output.add(nums3[i]);
            }
        }
        return output.stream().distinct().collect(Collectors.toList());
    }

    public boolean isNumberPresentInArray(int [] arr, int n) {
        for (int i : arr) {
            if (i == n) return true;
        }
        return false;
    }
}
