package solution.leetcode;

import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
    public static void main(String[] args) {
        SumOfValuesAtIndicesWithKSetBits sv = new SumOfValuesAtIndicesWithKSetBits();
        System.out.println(sv.sumIndicesWithKSetBits(List.of(5, 10, 1, 5, 2), 1)); // 7
        System.out.println(sv.sumIndicesWithKSetBits(List.of(4, 3, 2, 1), 2)); // 4
        System.out.println(sv.sumIndicesWithKSetBits(List.of(1, 2, 3), 3)); // 0
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int output = 0;
        for(int i = 0; i<nums.size(); i++){
            if(countOfBits(i) == k) output = output + nums.get(i);
        }
        return output;
    }
    public int countOfBits(int j){
        String s = Integer.toBinaryString(j);
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1') count++;
        }
        return count;
    }
}
