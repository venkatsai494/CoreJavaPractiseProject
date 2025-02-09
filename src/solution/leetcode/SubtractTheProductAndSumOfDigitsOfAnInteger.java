package solution.leetcode;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {
        SubtractTheProductAndSumOfDigitsOfAnInteger sps = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        System.out.println(sps.subtractProductAndSum(234));
    }

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            product = product * n%10;
            n = n/10;
        }
        return product-sum;
    }
}
