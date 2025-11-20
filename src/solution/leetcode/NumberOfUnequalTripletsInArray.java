package solution.leetcode;

public class NumberOfUnequalTripletsInArray {
    public static void main(String[] args) {
        NumberOfUnequalTripletsInArray n = new NumberOfUnequalTripletsInArray();
        System.out.println(n.unequalTriplets(new int[]{4,4,2,4,3})); // Output: 3
        System.out.println(n.unequalTriplets(new int[]{1,1,1,1,1})); // Output: 0
    }
    public int unequalTriplets(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if((nums[i] != nums[j]) && (nums[j] != nums[k]) && (nums[k] != nums[i])) count ++;
                }
            }
        }
        return count;
    }
}
