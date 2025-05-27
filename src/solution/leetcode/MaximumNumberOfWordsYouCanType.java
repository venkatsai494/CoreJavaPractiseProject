package solution.leetcode;

public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {
        MaximumNumberOfWordsYouCanType mn = new MaximumNumberOfWordsYouCanType();
        System.out.println(mn.canBeTypedWords("venkat sai ratan kumar parpelli", "hs")); // 4
        System.out.println(mn.canBeTypedWords("hello world", "ad")); // 1
        System.out.println(mn.canBeTypedWords("leet code", "lt")); // 1
        System.out.println(mn.canBeTypedWords("leet code", "e")); // 0
        System.out.println(mn.canBeTypedWords("a b c d e f g h i j k l m n o p q r s t u v w x y z", "abcdefghijklmnopqrstuvwxyz")); // 0
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String [] strArray = text.split(" ");
        outerfor:
        for(String s: strArray){
            for(int j = 0; j<brokenLetters.length(); j++){
                if(s.contains(String.valueOf(brokenLetters.charAt(j)))){
                    continue outerfor;
                }
            }
            count++;
        }
        return count;
    }
}
