package solution.leetcode;

public class SortArrayByParity {
    public static void main(String[] args) {
        SortArrayByParity sap = new SortArrayByParity();
        int [] nums = {3,1,2,4};
        int [] output = sap.sortArrayByParity(nums);
        for(int i = 0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }
    public int[] sortArrayByParity(int[] nums) {
        int [] output = new int [nums.length];
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                output[count] = nums[i];
                count++;
            }
        }
        for(int j = 0; j<nums.length; j++){
            if(nums[j]%2!=0){
                output[count] = nums[j];
                count++;
            }
        }
        return output;
    }
}
