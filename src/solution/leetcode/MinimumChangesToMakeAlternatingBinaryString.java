package solution.leetcode;

public class MinimumChangesToMakeAlternatingBinaryString {
    public static void main(String[] args) {
        MinimumChangesToMakeAlternatingBinaryString minimumChangesToMakeAlternatingBinaryString = new MinimumChangesToMakeAlternatingBinaryString();
        System.out.println(minimumChangesToMakeAlternatingBinaryString.minOperations("0100"));
        System.out.println(minimumChangesToMakeAlternatingBinaryString.minOperations("10"));
        System.out.println(minimumChangesToMakeAlternatingBinaryString.minOperations("1111"));
    }
    public int minOperations(String s) {
        StringBuilder sb0 = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int c0 = 0;
        int c1 = 0;
        int l = s.length();
        for(int i = 0; i<l; i++){
            if(i%2==0){
                sb0.append("0");
                sb1.append("1");
            }
            else{
                sb0.append("1");
                sb1.append("0");
            }
        }
        for(int i = 0; i<l; i++){
            if(s.charAt(i)!= sb0.charAt(i)){
                c0++;
            }
            if(s.charAt(i) != sb1.charAt(i)){
                c1++;
            }
        }
        return Math.min(c0, c1);
    }
}
