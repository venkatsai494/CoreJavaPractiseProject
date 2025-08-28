package solution.leetcode;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        CountCommonWordsWithOneOccurrence solution = new CountCommonWordsWithOneOccurrence();
        System.out.println(solution.countWords(new String[]{"leetcode","is","amazing","as","is"}, new String[]{"amazing","leetcode","is"})); // Output: 2
        System.out.println(solution.countWords(new String[]{"b","bb","bbb"}, new String[]{"a","aa","aaa"})); // Output: 0
        System.out.println(solution.countWords(new String[]{"a","ab"}, new String[]{"a","a","a","ab"})); // Output: 1
    }
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        for(String word : words1) {
            if (onlyOnce(word, words1) && onlyOnce(word, words2)) {
                count++;
            }
        }
        return count;
    }
    public boolean onlyOnce(String word, String[] words) {
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return count == 1;
    }
}
