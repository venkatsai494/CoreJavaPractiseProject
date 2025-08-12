package solution.leetcode;

import java.util.Arrays;

public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        KeepMultiplyingFoundValuesByTwo solution = new KeepMultiplyingFoundValuesByTwo();
        System.out.println(solution.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3)); // Output: 24
        System.out.println(solution.findFinalValue(new int[]{2, 7, 9}, 4)); // Output: 4
        System.out.println(solution.findFinalValue(new int[]{1, 2, 3}, 1)); // Output: 8
    }
    public int findFinalValue(int[] nums, int original) {
        while(isPresent(nums, original)){
            original = original*2;
        }
        return original;
    }
    public boolean isPresent(int[] arr, int a){
        return Arrays.stream(arr).anyMatch(t->t==a);
    }
}
