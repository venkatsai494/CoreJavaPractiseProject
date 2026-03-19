package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfOperationsToMakeElementsInArrayDistinct {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToMakeElementsInArrayDistinct m = new MinimumNumberOfOperationsToMakeElementsInArrayDistinct();
        System.out.println(m.minimumOperations(new int[]{1,2,3,4,5})); // 0
        System.out.println(m.minimumOperations(new int[]{1,1,2})); // 1
        System.out.println(m.minimumOperations(new int[]{0,0,0})); // 1
        System.out.println(m.minimumOperations(new int[]{1,2,3,4,2,3,3,5,7})); // 2
        System.out.println(m.minimumOperations(new int[]{4,5,6,4,4})); // 2
        System.out.println(m.minimumOperations(new int[]{6,7,8,9})); // 0
    }
    public int minimumOperations(int[] nums) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length-1;i>=0;i--){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
            else{
                result = (i/3)+1;
                break;
            }
        }
        return result;
    }
}
