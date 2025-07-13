package solution.leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(19)); // true
        System.out.println(hn.isHappy(2)); // false
        System.out.println(hn.isHappy(7)); // true
        System.out.println(hn.isHappy(1)); // true
        System.out.println(hn.isHappy(1111111111)); // true
    }
    public boolean isHappy(int n) {
        do{
            n = sumofSquaresOfNumber(n);
            if(n == 2 || n == 3 || n == 4 || n == 5|| n == 6|| n == 8 || n == 9) return false;
        }while(n>=10);
        return (n==1 || n == 7);
    }

    public int sumofSquaresOfNumber(int n){
        int sum = 0;
        while(n>0){
            sum = sum + ((n%10)*(n%10));
            n = n/10;
        }
        return sum;
    }
}
