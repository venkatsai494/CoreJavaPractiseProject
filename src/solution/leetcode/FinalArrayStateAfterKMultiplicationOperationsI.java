package solution.leetcode;
import java.util.Arrays;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public static void main(String[] args) {
        FinalArrayStateAfterKMultiplicationOperationsI solution = new FinalArrayStateAfterKMultiplicationOperationsI();
        System.out.println(Arrays.toString(solution.getFinalState(new int[]{2,1,3,5,6}, 5, 2))); // Output: [8, 4, 6, 5, 6]
        System.out.println(Arrays.toString(solution.getFinalState(new int[]{1,2}, 3, 4))); // Output: [16, 8]
        System.out.println(Arrays.toString(solution.getFinalState(new int[]{1,2,3,4}, 2, 2))); // Output: [4, 2, 3, 4]
        System.out.println(Arrays.toString(solution.getFinalState(new int[]{1,1,1,1}, 4, 3))); // Output: [3, 3, 3, 3]
        System.out.println(Arrays.toString(solution.getFinalState(new int[]{5,7,9}, 3, 10))); // Output: [50, 70, 90]
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int min =  Arrays.stream(nums).min().isPresent()?Arrays.stream(nums).min().getAsInt():0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i] == min){
                    nums[i] = nums[i] * multiplier;
                    break;
                }
            }
            k--;
        }
        return nums;
    }
}
