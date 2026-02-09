package solution.leetcode;

public class CheckDivisibilityByDigitSumAndProduct {
    public static void main(String[] args) {
        CheckDivisibilityByDigitSumAndProduct solution = new CheckDivisibilityByDigitSumAndProduct();
        System.out.println(solution.checkDivisibility(99));
        System.out.println(solution.checkDivisibility(23));
        System.out.println(solution.checkDivisibility(123));
    }
    public boolean checkDivisibility(int n) {
        int temp = digitMultiplication(n) + digitSum(n);
        return n%temp==0;
    }
    public int digitMultiplication(int n){
        int mul = 1;
        while(n>0){
            mul = mul * (n%10);
            n = n/10;
        }
        return mul;
    }
    public int digitSum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;
    }
}
