package solution.leetcode;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        NumberOfArithmeticTriplets nat = new NumberOfArithmeticTriplets();
        System.out.println(nat.arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3)); // Output: 2
        System.out.println(nat.arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2)); // Output: 2
    }
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    if((nums[j] - nums[i] == diff) && (nums[k] - nums[j] == diff))  count++;
                }
            }
        }
        return count;
    }
}
