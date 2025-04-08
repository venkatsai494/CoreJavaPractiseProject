package solution.leetcode;

public class ArrangingCoins {
    public static void main(String[] args) {
        ArrangingCoins ac = new ArrangingCoins();
        System.out.println(ac.arrangeCoins(5));
        System.out.println(ac.arrangeCoins(8));
    }
    public int arrangeCoins(int n) {
        int output = 0;
        int i= 1;
        while(n>=i){
            n = n - i;
            output = i;
            i++;
        }
        return output;
    }
}
