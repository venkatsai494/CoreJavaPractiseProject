package solution.leetcode;

import java.util.Arrays;

public class NextGreaterElementII {
    public static void main(String[] args) {
        NextGreaterElementII nextGreaterElementII = new NextGreaterElementII();
        System.out.println(Arrays.toString(nextGreaterElementII.nextGreaterElements(new int[]{1,2,1})));//[2,-1,2]
        System.out.println(Arrays.toString(nextGreaterElementII.nextGreaterElements(new int[]{1,2,3,4,3})));//[2,3,4,-1,4]
        System.out.println(Arrays.toString(nextGreaterElementII.nextGreaterElements(new int[]{5,4,3,2,1})));//[-1,5,5,5,5]
        System.out.println(Arrays.toString(nextGreaterElementII.nextGreaterElements(new int[]{1,5,3,6,8})));//[5,6,6,8,-1]
        System.out.println(Arrays.toString(nextGreaterElementII.nextGreaterElements(new int[]{1,8,-1,-100,-1,222,1111111,-111111})));//[8,222,222,-1,222,1111111,-1,1]
    }
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        boolean[] flag = new boolean[nums.length];
        Arrays.fill(result, -1);
        for(int i = 0; i<result.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] > nums[i]){
                    result[i] = nums[j];
                    flag[i] = true;
                    break;
                }
            }
            if(!flag[i]){
                for(int j = 0;j<i;j++){
                    if(nums[j] > nums[i]){
                        result[i] = nums[j];
                        break;
                    }
                }
            }
        }
        return result;
    }
}
