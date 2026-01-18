package solution.leetcode;

public class TheKthFactorOfN {
    public static void main(String[] args) {
        TheKthFactorOfN solution = new TheKthFactorOfN();
        System.out.println(solution.kthFactor(12, 3)); // Output: 3
        System.out.println(solution.kthFactor(7, 2)); // Output: 7
        System.out.println(solution.kthFactor(4, 4)); // Output: -1
    }
    public int kthFactor(int n, int k) {
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                k--;
            }
            if(k==0){
                return i;
            }
        }
        return -1;
    }

}
