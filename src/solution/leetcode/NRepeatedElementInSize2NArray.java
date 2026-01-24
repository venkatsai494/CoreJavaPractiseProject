package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        NRepeatedElementInSize2NArray solution = new NRepeatedElementInSize2NArray();
        System.out.println(solution.repeatedNTimes(new int[]{1,2,3,3})); // 3
        System.out.println(solution.repeatedNTimes(new int[]{2,1,2,5,3,2})); // 2
        System.out.println(solution.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4})); // 5
    }
    public int repeatedNTimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) return num;
            list.add(num);
        }
        return 0;
    }
}
