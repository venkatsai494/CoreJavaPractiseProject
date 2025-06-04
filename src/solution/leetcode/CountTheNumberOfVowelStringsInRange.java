package solution.leetcode;

public class CountTheNumberOfVowelStringsInRange {
    public static void main(String[] args) {
        CountTheNumberOfVowelStringsInRange cv = new CountTheNumberOfVowelStringsInRange();
        System.out.println(cv.vowelStrings(new String[]{"are","amy","u"}, 0, 2)); // 2
        System.out.println(cv.vowelStrings(new String[]{"hey","aeo","mu","ooo","artro"}, 1, 4)); // 3
        System.out.println(cv.vowelStrings(new String[]{"aba","bcb","ece","aa","e"}, 0, 2)); // 2
        System.out.println(cv.vowelStrings(new String[]{"a","e","i"}, 0, 2)); // 3
        System.out.println(cv.vowelStrings(new String[]{"a","b","c"}, 0, 2)); // 1
        System.out.println(cv.vowelStrings(new String[]{"a","b","c"}, 1, 2)); // 0
    }
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i<=right && i< words.length; i++){
            if((words[i].startsWith("a") || words[i].startsWith("e") || words[i].startsWith("i") || words[i].startsWith("o") || words[i].startsWith("u")) && 
                    (words[i].endsWith("a") || words[i].endsWith("e") || words[i].endsWith("i") || words[i].endsWith("o") || words[i].endsWith("u"))) count++;
        }
        return count;
    }
}
