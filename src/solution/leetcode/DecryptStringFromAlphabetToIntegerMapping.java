package solution.leetcode;

public class DecryptStringFromAlphabetToIntegerMapping {

    public static void main(String[] args) {
        DecryptStringFromAlphabetToIntegerMapping ds = new DecryptStringFromAlphabetToIntegerMapping();
        System.out.println(ds.freqAlphabets("10#11#12"));//jkab
        System.out.println(ds.freqAlphabets("1326#"));//acz
        System.out.println(ds.freqAlphabets("25#"));
        System.out.println(ds.freqAlphabets("123456789#"));
    }

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            if(s.charAt(i) == '#'){
                int i1 = 96 + Integer.parseInt(s.substring(i - 2, i));
                sb.append((char)i1);
                i = i-3;
            }
            else{
                int i2 = 96 + Integer.parseInt(String.valueOf(s.charAt(i)));
                sb.append((char)i2);
                i--;
            }
        }
        return sb.reverse().toString();
    }
}
