package solution.leetcode;

public class SqrtClass {
    public int mySqrt(int x) {
        int result = 1;
        for(int i = 1; i<x; i++){
            if((i*i)==x)
                result = i;
            else if((i*i)>x)
                result = i-1;
        }
        return result;
    }

    public static void main(String[] args) {
        SqrtClass sc = new SqrtClass();
        System.out.println(sc.mySqrt(8));
    }
}
