package solution.leetcode;

public class ComplementOfBase10Integer {
    public static void main(String[] args) {
        ComplementOfBase10Integer cb10i = new ComplementOfBase10Integer();
        System.out.println(cb10i.bitwiseComplement(5)); // Output: 2
        System.out.println(cb10i.bitwiseComplement(1)); // Output: 0
        System.out.println(cb10i.bitwiseComplement(7)); // Output: 0
    }
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') sb.append("0");
            else sb.append("1");
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
