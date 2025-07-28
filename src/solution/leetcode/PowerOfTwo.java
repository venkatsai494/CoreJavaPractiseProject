package solution.leetcode;

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo solution = new PowerOfTwo();
        System.out.println(solution.isPowerOfTwo(1)); // true
        System.out.println(solution.isPowerOfTwo(2)); // true
        System.out.println(solution.isPowerOfTwo(3)); // false
        System.out.println(solution.isPowerOfTwo(4)); // true
        System.out.println(solution.isPowerOfTwo(5)); // false
        System.out.println(solution.isPowerOfTwo(16)); // true
        System.out.println(solution.isPowerOfTwo(18)); // false
        System.out.println(solution.isPowerOfTwo(64)); // true
        System.out.println(solution.isPowerOfTwo(-8)); // true
    }
    public boolean isPowerOfTwo(int n) {
        boolean isNegative = n<0;
        if(isNegative) {
            return false;
        }
        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1') count++;
        }
        return count == 1;
    }
}
