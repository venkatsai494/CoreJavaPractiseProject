package solution.leetcode;

public class Maximum69Number {
    public static void main(String[] args) {
        Maximum69Number maximum69Number = new Maximum69Number();
        System.out.println(maximum69Number.maximum69Number(9669));
        System.out.println(maximum69Number.maximum69Number(9996));
        System.out.println(maximum69Number.maximum69Number(9999));
    }
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        if(!String.valueOf(num).contains("6")) return num;
        int temp = 0;
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) == '6') {
                temp = i;
                break;
            }
        }
        sb.setCharAt(temp, '9');
        return Integer.valueOf(sb.toString());
    }
}
