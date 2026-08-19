package solution.leetcode;

public class GCDOfOddAndEvenSums {
    public static void main(String[] args) {
        GCDOfOddAndEvenSums gcdCalculator = new GCDOfOddAndEvenSums();
        System.out.println(gcdCalculator.gcdOfOddEvenSums(4)); // Output: 4
        System.out.println(gcdCalculator.gcdOfOddEvenSums(5)); // Output: 5
        System.out.println(gcdCalculator.gcdOfOddEvenSums(10)); // Output: 10
    }
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
    public int gcdOfOddEvenSums1(int n) {
        int sumOfOddNumbers = n*n;
        int sumOfEvenNumbers = n*(n+1);
        int gcd = 0;
        for(int i = sumOfOddNumbers/2; i>0; i--){
            if(sumOfOddNumbers%i==0 && sumOfEvenNumbers%i==0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
