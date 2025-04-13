package solution.leetcode;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        int [] nums = {0,1,0,3,12};
        mz.moveZeroes(nums);
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i<nums.length; i++){
            if(nums[i] == 0)    moveZeroes1(nums);
        }
    }
    public void moveZeroes1(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]==0){
                nums[i] = nums[i+1];
                nums[i+1] = 0;
            }
        }
    }
}
