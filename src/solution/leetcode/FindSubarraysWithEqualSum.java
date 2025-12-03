package solution.leetcode;

public class FindSubarraysWithEqualSum {
    public static void main(String[] args) {
        FindSubarraysWithEqualSum f = new FindSubarraysWithEqualSum();
        System.out.println(f.findSubarrays(new int[]{4,2,4})); // true
        System.out.println(f.findSubarrays(new int[]{1,2,3,4,5})); // false
        System.out.println(f.findSubarrays(new int[]{0,0,0})); // true
    }
    public boolean findSubarrays(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            int sum = nums[i]+nums[i+1];
            for(int j = i+1; j<nums.length-1; j++){
                if((nums[j]+nums[j+1])==sum) return true;
            }
        }
        return false;
    }
}
