package solution.leetcode;

public class HashDividedString {
    public static void main(String[] args) {
        HashDividedString hashDividedString = new HashDividedString();
        System.out.println(hashDividedString.stringHash("abcd", 2));
        System.out.println(hashDividedString.stringHash("mxz", 3));
    }
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        String [] strs = new String[len/k];
        for(int i = 0;i<len/k;i++){
            strs[i] = s.substring(i*k, (i*k)+k);
        }
        for (String str : strs) {
            sb.append(stringToCharUsingHash(str));
        }
        return sb.toString();
    }
    public char stringToCharUsingHash(String s){
        int result = 0;
        for(char c : s.toCharArray()){
            result  = result + (c-'a');
        }
        return (char)(result%26+'a');
    }
}
