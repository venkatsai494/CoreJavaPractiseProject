package solution.leetcode;

public class FindTheArrayConcatenationValue {
    public static void main(String[] args) {
        FindTheArrayConcatenationValue solution = new FindTheArrayConcatenationValue();
        System.out.println(solution.findTheArrayConcVal(new int[]{7,52,2,4}));
        System.out.println(solution.findTheArrayConcVal(new int[]{5,14,13,8,12}));
    }
    public long findTheArrayConcVal(int[] nums) {
        long result = 0;
        int start = 0;
        int end = nums.length-1;
        if(end%2==0){
            result = result + nums[(end/2)];
        }
        while(start<end){
            int temp = Integer.parseInt(nums[start]+""+nums[end]);
            result = result + temp;
            start++;
            end--;
        }
        return result;
    }
}
