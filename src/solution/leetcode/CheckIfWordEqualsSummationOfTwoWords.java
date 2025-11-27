package solution.leetcode;

public class CheckIfWordEqualsSummationOfTwoWords {
    public static void main(String[] args) {
        CheckIfWordEqualsSummationOfTwoWords obj = new CheckIfWordEqualsSummationOfTwoWords();
        System.out.println(obj.isSumEqual("acb", "cba", "cdb")); // true
        System.out.println(obj.isSumEqual("aaa", "a", "aab")); // false
        System.out.println(obj.isSumEqual("aaa", "a", "aaaa")); // true
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int f = convertStringToInt(firstWord);
        int s = convertStringToInt(secondWord);
        int t = convertStringToInt(targetWord);
        return ((f+s)==t);
    }

    public int convertStringToInt(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            sb.append(c-97);
        }
        return Integer.parseInt(sb.toString());
    }
}
