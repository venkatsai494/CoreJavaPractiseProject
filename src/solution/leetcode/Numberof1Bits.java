package solution.leetcode;

public class Numberof1Bits {
    public static void main(String[] args) {
        Numberof1Bits obj = new Numberof1Bits();
        System.out.println(obj.hammingWeight(11)); // 3
        System.out.println(obj.hammingWeight(128)); // 1
        System.out.println(obj.hammingWeight(2147483645)); //30
    }
    public int hammingWeight(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        for(char c: s.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}
