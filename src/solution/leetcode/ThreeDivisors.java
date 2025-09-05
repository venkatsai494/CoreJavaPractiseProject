package solution.leetcode;

public class ThreeDivisors {
    public static void main(String[] args) {
        ThreeDivisors td = new ThreeDivisors();
        System.out.println(td.isThree(2)); // false
        System.out.println(td.isThree(4)); // true
        System.out.println(td.isThree(5)); // false
        System.out.println(td.isThree(9)); // true
        System.out.println(td.isThree(10)); // false
        System.out.println(td.isThree(25)); // true
        System.out.println(td.isThree(49)); // true
        System.out.println(td.isThree(1)); // false
    }
    public boolean isThree(int n) {
        int count = 0;
        if(n<4) return false;
        for(int i = 2; i<=n/2; i++){
            if(n%i==0) count++;
        }
        return count==1;
    }
}
