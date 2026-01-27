package solution.leetcode;

public class FindTheEncryptedString {
    public static void main(String[] args) {
        FindTheEncryptedString solution = new FindTheEncryptedString();
        System.out.println(solution.getEncryptedString("abcdefg", 2)); // Output: "cdefgab"
        System.out.println(solution.getEncryptedString("hijklmnop", 3)); // Output: "klmnophij"
        System.out.println(solution.getEncryptedString("dart", 3)); // Output: "tdar"
        System.out.println(solution.getEncryptedString("aaa", 1)); // Output: "aaa"
        System.out.println(solution.getEncryptedString("oxoq", 4)); // Output: "oxoq"
    }
    public String getEncryptedString(String s, int k) {
        StringBuilder sb = new StringBuilder();
        k = k%(s.length());
        for(int i = k; i<s.length(); i++){
            sb.append(s.charAt(i));
            if(i == s.length()-1){
                i=-1;
            }
            if(sb.length() == s.length()){
                break;
            }
        }
        return sb.toString();
    }
}
