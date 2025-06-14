package solution.leetcode;

public class MinimumBitFlipsToConvertNumber {
    public static void main(String[] args) {
        MinimumBitFlipsToConvertNumber mbf = new MinimumBitFlipsToConvertNumber();
        System.out.println(mbf.minBitFlips(10, 7)); // Output: 3
        System.out.println(mbf.minBitFlips(3, 4)); // Output: 3
        System.out.println(mbf.minBitFlips(0, 0)); // Output: 0
    }
    public int minBitFlips(int start, int goal) {
        int count = 0;
        String sb = Integer.toBinaryString(start);
        String gb = Integer.toBinaryString(goal);
        int diff = Math.abs(sb.length() - gb.length());
        String appender = "";
        while(diff>0){
            appender = appender + "0";
            diff--;
        }
        if(sb.length()>gb.length()) {
            gb = appender + gb;
        }
        else if(sb.length()<gb.length()){
            sb = appender + sb;
        }
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) != gb.charAt(i)) count++;
        }
        return count;
    }
}
