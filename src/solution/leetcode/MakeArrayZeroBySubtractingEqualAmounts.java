package solution.leetcode;

import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public static void main(String[] args) {
        MakeArrayZeroBySubtractingEqualAmounts makeArrayZeroBySubtractingEqualAmounts = new MakeArrayZeroBySubtractingEqualAmounts();
        System.out.println(makeArrayZeroBySubtractingEqualAmounts.minimumOperations(new int[]{1,5,0,3,5}));
        System.out.println(makeArrayZeroBySubtractingEqualAmounts.minimumOperations(new int[]{0}));
    }
    public int minimumOperations(int[] nums) {
        return (int) Arrays.stream(nums).distinct().filter(i->i>0).count();
    }
}
