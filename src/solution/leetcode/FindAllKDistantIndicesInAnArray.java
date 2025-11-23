package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesInAnArray {
    public static void main(String[] args) {
        FindAllKDistantIndicesInAnArray obj = new FindAllKDistantIndicesInAnArray();
        System.out.println(obj.findKDistantIndices(new int[]{3,4,9,1,3,9,5}, 9, 1)); // [1,2,3,4,5,6]
        System.out.println(obj.findKDistantIndices(new int[]{2,2,2,2,2}, 2, 2)); // [0,1,2,3,4]
    }
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> output = new ArrayList<>();
        List<Integer> indicesWithKey = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == key) indicesWithKey.add(i);
        }
        for(int i = 0; i<nums.length; i++){
            for(int j: indicesWithKey){
                if(Math.abs(i-j)<=k){
                    output.add(i);
                    break;
                }
            }
        }
        return output;
    }
}
