package solution.leetcode;

public class FindThePivotInteger {
    public static void main(String[] args) {
        FindThePivotInteger fpi = new FindThePivotInteger();
        System.out.println(fpi.pivotInteger(8)); // 6
        System.out.println(fpi.pivotInteger(1)); // 1
        System.out.println(fpi.pivotInteger(4)); // -1
        System.out.println(fpi.pivotInteger(5)); // 2
        System.out.println(fpi.pivotInteger(6)); // 4
    }
    public int pivotInteger(int n) {
        if(n == 1) return n;
        for(int i = 0; i<n; i++){
            if(sumTillNumer(i) == sumFromTillNumbers(i,n))
                return i;
        }
        return -1;
    }
    public int sumTillNumer(int n){
        int output = 0;
        for(int i = 0; i<=n; i++){
            output = output + i;
        }
        return output;
    }

    public int sumFromTillNumbers(int a, int b){
        int output = 0;
        for(int i = a; i<=b; i++){
            output += i;
        }
        return output;
    }

}
