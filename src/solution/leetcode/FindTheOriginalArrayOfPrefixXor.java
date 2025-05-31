package solution.leetcode;

import java.util.Arrays;

public class FindTheOriginalArrayOfPrefixXor {
    public static void main(String[] args) {
        FindTheOriginalArrayOfPrefixXor solution = new FindTheOriginalArrayOfPrefixXor();
        System.out.println(Arrays.toString(solution.findArray(new int[]{5, 2, 0, 3, 1})));//[5, 7, 2, 3, 2]
        System.out.println(Arrays.toString(solution.findArray(new int[]{13})));//[13]

    }
    public int[] findArray(int[] pref) {
        int [] result = new int[pref.length];
        int temp = 0;
        for(int i = 0; i<pref.length; i++){
            result[i] = temp ^ pref[i];
            temp = temp ^ result[i];
        }
        return result;
    }
}
