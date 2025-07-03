package solution.leetcode;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        FirstLetterToAppearTwice fl = new FirstLetterToAppearTwice();
        System.out.println(fl.repeatedCharacter("abccbaacz"));//c
        System.out.println(fl.repeatedCharacter("abcdd"));//d
        System.out.println(fl.repeatedCharacter("aabbcc"));//a
        System.out.println(fl.repeatedCharacter("abcdefhsbasd"));
        System.out.println(fl.repeatedCharacter("venkat sai ratan kumar parpelli"));
    }
    public char repeatedCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(sb.toString().contains(String.valueOf(s.charAt(i)))){
                return s.charAt(i);
            }
            sb.append(s.charAt(i));
        }
        return s.charAt(0);
    }
}
