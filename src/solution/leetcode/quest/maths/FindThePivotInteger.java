package solution.leetcode.quest.maths;

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
        int totalSum = (n*(n+1))/2;
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
            if(sum == totalSum) return i;
            if(sum>totalSum) return -1;
            totalSum = totalSum - i;
        }
        return -1;
    }
}
