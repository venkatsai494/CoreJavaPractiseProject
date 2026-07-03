package solution.leetcode;

public class ValidDigitNumber {
    public static void main(String[] args) {
        ValidDigitNumber validDigitNumber = new ValidDigitNumber();
        System.out.println(validDigitNumber.validDigit(101, 0));
        System.out.println(validDigitNumber.validDigit(232, 2));
        System.out.println(validDigitNumber.validDigit(5, 1));
        System.out.println(validDigitNumber.validDigit(123, 4));
    }
    public boolean validDigit(int n, int x) {
        return !String.valueOf(n).startsWith(String.valueOf(x)) && String.valueOf(n).contains(String.valueOf(x));
    }
}
