package solution.leetcode;

public class SortArrayByParityII {
    public static void main(String[] args) {
        SortArrayByParityII sap = new SortArrayByParityII();
        int [] output = sap.sortArrayByParityII(new int[]{1,2,3,4,5,10,6,7,8,9});
        for(int i = 0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }
    public int[] sortArrayByParityII(int[] nums) {
        int [] output = new int[nums.length];
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                output[index] = nums[i];
                index = index + 2;
            }
        }
        index = 1;
        for(int j = 0; j<nums.length; j++){
            if(nums[j]%2!=0){
                output[index] = nums[j];
                index = index + 2;
            }
        }
        return output;
    }
}
