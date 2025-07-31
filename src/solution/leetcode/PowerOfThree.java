package solution.leetcode;

public class PowerOfThree {
    public static void main(String[] args) {
        PowerOfThree solution = new PowerOfThree();
        System.out.println(solution.isPowerOfThree(1)); // true
        System.out.println(solution.isPowerOfThree(3)); // true
        System.out.println(solution.isPowerOfThree(27)); // true
        System.out.println(solution.isPowerOfThree(10)); // false
        System.out.println(solution.isPowerOfThree(28)); // false
        System.out.println(solution.isPowerOfThree(243)); // true
        System.out.println(solution.isPowerOfThree(45)); // true
    }
    public boolean isPowerOfThree(int n) {
        if(n<0) return false;
        else {
            String s = Integer.toString(n, 3);
            int count = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == '1') count++;
                if(s.charAt(i) == '2') return false;
            }
            return count==1;
        }
    }
}
