package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne solution = new PlusOne();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1,2,3})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9})));
    }
    public int[] plusOne(int[] digits) {
        int []result = new int[digits.length];
        int carry = 1;
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]+carry>9){
                result[i] = 0;
            }
            else{
                result[i] = digits[i] + carry ;
                carry = 0;
            }
        }
        if(carry>0){
            List<Integer> tempList = new ArrayList<>();
            tempList.add(1);
            for(int i: result) tempList.add(i);
            int [] updatedResult = new int[result.length+1];
            for(int i = 0; i<tempList.size(); i++){
                updatedResult[i] = tempList.get(i);
            }
            return updatedResult;
        }
        return result;
    }
}
