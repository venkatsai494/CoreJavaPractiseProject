package solution.leetcode;

public class ReversePrefixOfWord {

    public static void main(String[] args) {
        ReversePrefixOfWord rp = new ReversePrefixOfWord();

        String s = "Hello";
        System.out.println(rp.reversePrefix("abcdefg", 'd'));
    }

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index<0) return word;
        else {
            StringBuffer sb = new StringBuffer(word.substring(0, index + 1));
            sb.reverse();
            sb.append(word.substring(index + 1));
            return sb.toString();
        }
    }
}
