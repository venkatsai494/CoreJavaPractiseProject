package solution.leetcode;

import java.util.Arrays;

public class MinimizeStringLength {
    public static void main(String[] args) {
        MinimizeStringLength obj = new MinimizeStringLength();
        System.out.println(obj.minimizedStringLength("aaabc")); // 3
        System.out.println(obj.minimizedStringLength("cbbd")); // 3
        System.out.println(obj.minimizedStringLength("dddaaa")); // 2
    }
    public int minimizedStringLength(String s) {
        Character [] charactersArray = new Character[s.length()];
        for(int i = 0; i<s.length(); i++){
            charactersArray[i] = s.charAt(i);
        }
        return (int)Arrays.stream(charactersArray).distinct().count();
    }
}
