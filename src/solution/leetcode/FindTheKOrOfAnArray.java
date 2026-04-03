package solution.leetcode;

import java.util.Arrays;

public class FindTheKOrOfAnArray {
    public static void main(String[] args) {
        FindTheKOrOfAnArray solution = new FindTheKOrOfAnArray();
        System.out.println(solution.findKOr(new int[]{7,12,9,8,9,15}, 4));
        System.out.println(solution.findKOr(new int[]{2,12,1,11,4,5}, 6));
        System.out.println(solution.findKOr(new int[]{10,8,5,9,11,6,8}, 1));
    }
    public int findKOr(int[] nums, int k) {
        StringBuilder [] sbArr = new StringBuilder[nums.length];
        int maxLength = Integer.toBinaryString(Arrays.stream(nums).max().getAsInt()).length();
        for(int i = 0; i<nums.length; i++){
            StringBuilder sb = new StringBuilder();
            sbArr[i] = sb.repeat('0',maxLength- Integer.toBinaryString(nums[i]).length()).append(Integer.toBinaryString(nums[i]));
        }
        StringBuilder res =  new StringBuilder();
        for(int i = 0; i<sbArr[0].length(); i++){
            int count = 0;
            for(int j = 0; j < sbArr.length; j++){
                if(sbArr[j].charAt(i) == '1'){
                    count++;
                }
                if(count>=k) {
                    res.append("1");
                    break;
                }
                if(j == sbArr.length - 1){
                    res.append("0");
                }
            }
        }
        return Integer.parseInt(res.toString(), 2);
    }
}
