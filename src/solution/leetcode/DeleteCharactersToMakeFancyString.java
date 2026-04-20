package solution.leetcode;

public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args) {
        DeleteCharactersToMakeFancyString obj = new DeleteCharactersToMakeFancyString();
        System.out.println(obj.makeFancyString("leeetcode"));
        System.out.println(obj.makeFancyString("aaabaaaa"));
        System.out.println(obj.makeFancyString("aab"));
    }
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        if(s.length()<3) return s;
        sb.append(s.charAt(0)).append(s.charAt(1));
        for(int i = 2; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1) || s.charAt(i) != s.charAt(i-2)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
