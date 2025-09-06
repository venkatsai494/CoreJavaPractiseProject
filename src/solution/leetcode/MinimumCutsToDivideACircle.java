package solution.leetcode;

public class MinimumCutsToDivideACircle {
    public static void main(String[] args) {
        MinimumCutsToDivideACircle m = new MinimumCutsToDivideACircle();
        System.out.println(m.numberOfCuts(4)); //2
        System.out.println(m.numberOfCuts(3)); //3
        System.out.println(m.numberOfCuts(1)); //0
        System.out.println(m.numberOfCuts(2)); //1
    }
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        return n%2==0?n/2:n;
    }
}
