package solution.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int numOfZeros = (int)Arrays.stream(nums).filter(n->n==0).count();
        if(numOfZeros>1) return result;
        int product = 1;
        for(int n : nums){
            if(n!=0)
            {
                product *= n;
            }
        }
        if(numOfZeros == 1){
            for(int i = 0; i<nums.length; i++){
                if(nums[i]==0){
                    result[i] = product;
                    return result;
                }
            }
        }
        else{
            for(int i = 0; i<nums.length; i++){
                result[i] = product/nums[i];
            }
        }
        return result;
    }
}