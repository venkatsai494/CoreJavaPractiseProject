package solution.leetcode;

public class SumOfDigitsInBaseK {
    public static void main(String[] args) {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        System.out.println(solution.sumBase(34, 6)); // Output: 9
        System.out.println(solution.sumBase(10, 10)); // Output: 1
        System.out.println(solution.sumBase(100, 2)); // Output: 3
    }
    public int sumBase(int n, int k) {
        String temp = Integer.toString(n, k);
        int sum = 0;
        for(char c : temp.toCharArray()){
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
