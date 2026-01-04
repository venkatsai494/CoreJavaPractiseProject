package solution.leetcode;

public class NumberComplement {
    public static void main(String[] args) {
        NumberComplement nc = new NumberComplement();
        System.out.println(nc.findComplement(5)); // Output: 2
        System.out.println(nc.findComplement(1)); // Output: 0
        System.out.println(nc.findComplement(7)); // Output: 0
        System.out.println(nc.findComplement(10)); // Output: 5
    }
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') sb.append("0");
            else sb.append("1");
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
