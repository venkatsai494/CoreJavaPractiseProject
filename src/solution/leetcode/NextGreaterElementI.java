package solution.leetcode;

import java.util.Arrays;

public class NextGreaterElementI {
    public static void main(String[] args) {
        NextGreaterElementI nge = new NextGreaterElementI();
        System.out.println(Arrays.toString(nge.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));
        System.out.println(Arrays.toString(nge.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})));
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            int temp = -1;
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    while(j<nums2.length-1){
                        j++;
                        if(nums1[i]<nums2[j]){
                            temp = nums2[j];
                            break;
                        }
                    }
                    break;
                }
            }
            result[i] = temp;
        }
        return result;
    }
}
