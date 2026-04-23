package solution.leetcode;

public class MinimumMovesToEqualArrayElementsIII {
    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsIII solution = new MinimumMovesToEqualArrayElementsIII();
        System.out.println(solution.minMoves(new int[]{2,1,3})); // Output: 3
        System.out.println(solution.minMoves(new int[]{4,4,5})); // Output: 2
        System.out.println(solution.minMoves(new int[]{1,2,3})); // Output: 3
        System.out.println(solution.minMoves(new int[]{5,6,8,8,5})); // Output: 8
    }
    public int minMoves(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int num: nums){
            max = Math.max(max, num);
            sum = sum + num;
        }
        return (max*(nums.length))-sum;
    }
}
