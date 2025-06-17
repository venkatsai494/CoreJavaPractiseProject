package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public static void main(String[] args) {
        SeparateTheDigitsInAnArray sd = new SeparateTheDigitsInAnArray();
        System.out.println(Arrays.toString(sd.separateDigits(new int[]{13,25,83,77})));
        System.out.println(Arrays.toString(sd.separateDigits(new int[]{7,1,3,9})));
        System.out.println(Arrays.toString(sd.separateDigits(new int[]{1991,1993,206,70})));
    }
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            String temp = String.valueOf(i);
            for(int j =0; j<temp.length(); j++){
                list.add(temp.charAt(j) - '0');
            }
        }
        int [] result = new int[list.size()];
        for(int i = 0; i<result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
