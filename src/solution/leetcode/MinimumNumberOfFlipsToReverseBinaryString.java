package solution.leetcode;

public class MinimumNumberOfFlipsToReverseBinaryString {
    public static void main(String[] args) {
        MinimumNumberOfFlipsToReverseBinaryString minimumNumberOfFlipsToReverseBinaryString = new MinimumNumberOfFlipsToReverseBinaryString();
        System.out.println(minimumNumberOfFlipsToReverseBinaryString.minimumFlips(10));
        System.out.println(minimumNumberOfFlipsToReverseBinaryString.minimumFlips(7));
        System.out.println(minimumNumberOfFlipsToReverseBinaryString.minimumFlips(111));
    }
    public int minimumFlips(int n) {
        int flips = 0;
        String s = Integer.toBinaryString(n);
        int l = s.length();
        for(int i = 0; i<l; i++){
            if(s.charAt(i) != s.charAt(l-i-1)) flips++;
        }
        return flips;
    }
}
