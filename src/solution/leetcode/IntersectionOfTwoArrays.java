package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(i.intersection(new int[]{1,2,2,1}, new int[]{2,2}))); // [2]
        System.out.println(Arrays.toString(i.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}))); // [4, 9]
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums1.length; i++) {
            for(int j = 0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j] && !list.contains(nums1[i])) {
                    list.add(nums1[i]);
                }
            }
        }
        for(int j = 0; j<nums2.length; j++) {
            for(int i = 0; i<nums1.length; i++) {
                if(nums2[j] == nums1[i] && !list.contains(nums2[j])) {
                    list.add(nums2[j]);
                }
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
