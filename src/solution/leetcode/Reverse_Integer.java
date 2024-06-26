package solution.leetcode;

public class Reverse_Integer {

    /*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).*/

    public int reverse(int x) {
        long result = 0L;
        while(x!=0){
            result = (10*result) + (x%10);
            x = x / 10;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        return (int)result;
    }

    public static void main(String[] args) {
        Reverse_Integer ri = new Reverse_Integer();
        System.out.println(ri.reverse(1534236469));
    }
}
