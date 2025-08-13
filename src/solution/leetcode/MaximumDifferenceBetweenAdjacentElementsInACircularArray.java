package solution.leetcode;

public class MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public static void main(String[] args) {
        MaximumDifferenceBetweenAdjacentElementsInACircularArray solution = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();
        System.out.println(solution.maxAdjacentDistance(new int[]{1,2,4})); // Output: 3
        System.out.println(solution.maxAdjacentDistance(new int[]{-5,-10,-5})); // Output: 5
        System.out.println(solution.maxAdjacentDistance(new int[]{1, 2, 3, 4})); // Output: 3
        System.out.println(solution.maxAdjacentDistance(new int[]{5, 10, 15, 20})); // Output: 15
        System.out.println(solution.maxAdjacentDistance(new int[]{1, 3, 6, 10})); // Output: 9
    }
    public int maxAdjacentDistance(int[] nums) {
        int max = Math.abs(nums[0]-nums[nums.length-1]);
        for(int i = 1; i<nums.length; i++){
            max = Math.max(max, Math.abs(nums[i] - nums[i-1]));
        }
        return max;
    }
}
