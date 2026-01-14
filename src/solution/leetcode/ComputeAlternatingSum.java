package solution.leetcode;

public class ComputeAlternatingSum {
    public static void main(String[] args) {
        ComputeAlternatingSum cas = new ComputeAlternatingSum();
        System.out.println(cas.alternatingSum(new int[]{1,3,5,7}));
        System.out.println(cas.alternatingSum(new int[]{100}));
    }
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                sum = sum + nums[i];
            }
            else{
                sum = sum - nums[i];
            }
        }
        return sum;
    }
}
