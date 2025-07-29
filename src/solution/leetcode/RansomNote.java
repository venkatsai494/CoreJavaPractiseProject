package solution.leetcode;

public class RansomNote {
    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
        System.out.println(solution.canConstruct("a", "b")); // false
        System.out.println(solution.canConstruct("aa", "ab")); // false
        System.out.println(solution.canConstruct("aa", "aab")); // true
        System.out.println(solution.canConstruct("abc", "cba")); // true
        System.out.println(solution.canConstruct("xyz", "zyxw")); // true
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        char [] ransomeNoteArray = new char[26];
        char [] magazineArray = new char[26];
        for(int i = 0; i < ransomNote.length(); i++){
            ransomeNoteArray[ransomNote.charAt(i)-97]++;
        }
        for(int i = 0; i < magazine.length(); i++){
            magazineArray[magazine.charAt(i)-97]++;
        }
        for(int i = 0; i<ransomeNoteArray.length; i++){
            if(ransomeNoteArray[i]>magazineArray[i]) return false;
        }
        return true;
    }
}
