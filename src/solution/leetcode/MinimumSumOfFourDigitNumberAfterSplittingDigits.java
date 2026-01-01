package solution.leetcode;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        MinimumSumOfFourDigitNumberAfterSplittingDigits solution = new MinimumSumOfFourDigitNumberAfterSplittingDigits();
        System.out.println(solution.minimumSum(2932)); // Output: 52
        System.out.println(solution.minimumSum(4009)); // Output: 13
    }
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i = 0;
        while(num>0){
            digits[i] = num%10;
            num = num/10;
            i++;
        }
        Arrays.sort(digits);

        return (((digits[0]*10)+digits[2])+((digits[1]*10)+digits[3]));
    }
}
