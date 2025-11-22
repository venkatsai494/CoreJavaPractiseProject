package solution.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        AddBinary ab = new AddBinary();
        System.out.println(ab.addBinary("11", "1")); // 100
        System.out.println(ab.addBinary("1010", "1011")); // 10101
        System.out.println(ab.addBinary("0", "0")); // 0
        System.out.println(ab.addBinary("111", "111")); // 1110
        System.out.println(ab.addBinary("1101", "1011")); // 11000
    }

    public String addBinary(String a, String b) {
        int ai = 0;
        int bi = 0;
        int ci = 0;
        StringBuilder result = new StringBuilder();
        StringBuilder sa = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);
        sa.reverse();
        sb.reverse();
        if(sa.length()>sb.length()){
            sb.repeat('0', sa.length()-sb.length());
        }
        else if(sb.length()>sa.length()){
            sa.repeat('0', sb.length()-sa.length());
        }

        for(int i = 0; i<sa.length() || i<sb.length(); i++){
            ai = sa.charAt(i) - '0';
            bi = sb.charAt(i) - '0';
            if(ai+bi+ci == 0){
                result.append("0");
                ci = 0;
            }
            else if(ai+bi+ci == 1){
                result.append("1");
                ci = 0;
            }
            else if(ai+bi+ci == 2){
                result.append("0");
                ci = 1;
            }
            else if(ai+bi+ci == 3){
                result.append("1");
                ci = 1;
            }
        }
        if(ci==1){
            result.append("1");
        }
        return result.reverse().toString();
    }
}
