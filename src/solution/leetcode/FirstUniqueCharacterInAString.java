package solution.leetcode;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        FirstUniqueCharacterInAString f = new FirstUniqueCharacterInAString();
        System.out.println(f.firstUniqChar("leetcode")); // 0
        System.out.println(f.firstUniqChar("loveleetcode")); // 2
        System.out.println(f.firstUniqChar("aabb")); // -1
        System.out.println(f.firstUniqChar("z")); // 0
        System.out.println(f.firstUniqChar("dddccdbba")); // 8
    }
    public int firstUniqChar(String s) {
        int [] charArr = new int[26];
        for(int i = 0; i < s.length(); i++){
            charArr[s.charAt(i)-97]++;
        }
        for(int i = 0; i < s.length(); i++){
            if(charArr[s.charAt(i)-97]==1) return i;
        }
        return -1;
    }
}
