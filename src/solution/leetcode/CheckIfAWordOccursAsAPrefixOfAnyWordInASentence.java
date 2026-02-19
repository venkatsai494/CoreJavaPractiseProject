package solution.leetcode;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public static void main(String[] args) {
        CheckIfAWordOccursAsAPrefixOfAnyWordInASentence solution = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
        System.out.println(solution.isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(solution.isPrefixOfWord("this problem is an easy problem", "pro"));
        System.out.println(solution.isPrefixOfWord("i am tired", "you"));
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strArr = sentence.split(" ");
        for(int i = 0; i<strArr.length; i++){
            if(strArr[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
