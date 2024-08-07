package solution.leetcode;

public class Pow_x_n {
        public double myPow(double x, int n) {
            double result = 1.0000;
        if(n==0)
            return result;
        if(n>0){
            while(n>0){
                result = result * x;
                n--;
            }
        }
        else if(n<0){
            n = n * (-1);
            while(n>0){
                result = result * (1/x);
                n--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Pow_x_n pxn = new Pow_x_n();
        System.out.println(pxn.myPow(2.00000,-3));
        System.out.println(Integer.MIN_VALUE);
    }
}
