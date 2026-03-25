package solution.leetcode;

public class CustomSortString {
    public static void main(String[] args) {
        CustomSortString customSortString = new CustomSortString();
        System.out.println(customSortString.customSortString("cba", "abcd"));
        System.out.println(customSortString.customSortString("bcafg", "abcd"));
    }
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        int[] alphabets = new int[26];
        for(int i = 0; i<s.length(); i++){
            alphabets[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<order.length(); i++){
            char c = order.charAt(i);
            if(alphabets[c-'a'] > 0){
                sb.repeat(c,alphabets[c-'a']);
                alphabets[c-'a'] = 0;
            }
        }
        for(int i = 0; i<alphabets.length; i++){
            if(alphabets[i]>0){
                sb.repeat((char)(i+'a'), alphabets[i]);
                alphabets[i] = 0;
            }
        }
        return sb.toString();
    }
}
