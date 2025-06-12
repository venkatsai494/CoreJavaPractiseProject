package solution.leetcode;

public class FindTriangularSumOfAnArray {
    public static void main(String[] args) {
        FindTriangularSumOfAnArray fts = new FindTriangularSumOfAnArray();
        System.out.println(fts.triangularSum(new int[]{1,2,3,4,5})); // Output: 8
        System.out.println(fts.triangularSum(new int[]{5})); // Output: 5
        System.out.println(fts.triangularSum(new int[]{4,2,1})); // Output: 0
        System.out.println(fts.triangularSum(new int[]{9})); // Output: 9
    }
    public int triangularSum(int[] nums) {
        int steps = nums.length;
        while(steps>1){
            for(int i = 0; i<steps-1; i++){
                nums[i] = (nums[i] + nums[i+1])%10;
            }
            steps--;
        }
        return nums[0];
    }
}
