package solution.leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(lswrc.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        int output = 0;
        int temp = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<s.length(); i++){
            if(!sb.toString().contains(String.valueOf(s.charAt(i)))){
                temp ++;
                sb = sb.append(s.charAt(i));
            }
            else{
                sb = new StringBuilder(sb.substring(sb.indexOf(String.valueOf(s.charAt(i)))+1));
                sb = sb.append(s.charAt(i));
                temp = sb.indexOf(String.valueOf(s.charAt(i)))+1;
            }
            if(temp>output) output = temp;
        }
        return output;
    }
}
