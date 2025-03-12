package solution.leetcode;

public class CountNumberOfPairsWithAbsoluteDifferenceK {

    public static void main(String[] args) {
        CountNumberOfPairsWithAbsoluteDifferenceK cp = new CountNumberOfPairsWithAbsoluteDifferenceK();
        System.out.println(cp.countKDifference(new int[]{1,2,2,1}, 1));
    }

    public int countKDifference(int[] nums, int k) {
        int output = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if((Math.abs(nums[i]-nums[j]))==k)    output++;
            }
        }
        return output;
    }
}
