package solution.leetcode;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.binaryGap(22));
        System.out.println(binaryGap.binaryGap(8));
        System.out.println(binaryGap.binaryGap(5));
        System.out.println(binaryGap.binaryGap(6));
    }
    public int binaryGap(int n) {
        int max = 0;
        String s = Integer.toBinaryString(n);
        int start = s.indexOf("1");
        for(int i = 0 ;i<s.length(); i++){
            int end;
            if(s.charAt(i) == '1'){
                end = i;
                max = Math.max(max, end-start);
                start = end;
            }
        }
        return max;
    }
}
