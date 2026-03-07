package solution.leetcode;

public class LongerContiguousSegmentsOfOnesThanZeros {
    public static void main(String[] args) {
        LongerContiguousSegmentsOfOnesThanZeros longerContiguousSegmentsOfOnesThanZeros = new LongerContiguousSegmentsOfOnesThanZeros();
        System.out.println(longerContiguousSegmentsOfOnesThanZeros.checkZeroOnes("1101"));
        System.out.println(longerContiguousSegmentsOfOnesThanZeros.checkZeroOnes("111000"));
        System.out.println(longerContiguousSegmentsOfOnesThanZeros.checkZeroOnes("110100010"));
    }
    public boolean checkZeroOnes(String s) {
        int long1 = 0;
        int long0 = 0;
        int current1 = 0;
        int current0 = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                current0 = 0;
                current1++;
            }
            else{
                current1 = 0;
                current0++;
            }
            long1 = Math.max(long1, current1);
            long0 = Math.max(long0, current0);
        }
        return long1>long0;
    }
}
