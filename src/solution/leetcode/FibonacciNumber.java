package solution.leetcode;

public class FibonacciNumber{
    public static void main(String[] args) {
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println(fn.fib(0)); // 0
        System.out.println(fn.fib(1)); // 1
        System.out.println(fn.fib(2)); // 1
        System.out.println(fn.fib(3)); // 2
        System.out.println(fn.fib(4)); // 3
        System.out.println(fn.fib(5)); // 5
        System.out.println(fn.fib(6)); // 8
        System.out.println(fn.fib(7)); // 13
    }
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
}
