package solution.leetcode;

public class CountEqualAndDivisiblePairsInAnArray {
    public static void main(String[] args) {
        CountEqualAndDivisiblePairsInAnArray cedi = new CountEqualAndDivisiblePairsInAnArray();
        System.out.println(cedi.countPairs(new int[]{3,1,2,2,2,1,3}, 2)); // 4
        System.out.println(cedi.countPairs(new int[]{1,2,3,1,1,3}, 2)); // 4
        System.out.println(cedi.countPairs(new int[]{1,2,3,4}, 1)); // 0
        System.out.println(cedi.countPairs(new int[]{1,1,1,1}, 2)); // 6
        System.out.println(cedi.countPairs(new int[]{0,0,0}, 2)); // 3

    }
    public int countPairs(int[] nums, int k) {
        int output = 0;
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if((nums[i] == nums[j]) && ((i*j)%k == 0))  output++;
            }
        }
        return output;
    }
}
