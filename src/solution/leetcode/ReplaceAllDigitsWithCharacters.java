package solution.leetcode;

public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        ReplaceAllDigitsWithCharacters r = new ReplaceAllDigitsWithCharacters();
        System.out.println(r.replaceDigits("a1c1e1"));
        System.out.println(r.replaceDigits("a1b2c3d4e"));
    }
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i = i+2){
            sb.append(s.charAt(i));
            if((i+1)<s.length()){
                sb.append((char)(s.charAt(i)+Integer.parseInt(String.valueOf(s.charAt(i+1)))));
            }
        }
        return sb.toString();
    }
}
