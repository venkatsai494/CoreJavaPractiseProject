package solution.leetcode;

public class PercentageOfLetterInString {
    public static void main(String[] args) {
        PercentageOfLetterInString solution = new PercentageOfLetterInString();
        System.out.println(solution.percentageLetter("foobar", 'o')); // 33
        System.out.println(solution.percentageLetter("jjjj", 'k')); // 0
        System.out.println(solution.percentageLetter("uau", 'u')); // 33
        System.out.println(solution.percentageLetter("abcde", 'a')); // 20
    }
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == letter) count++;
        }
        return Math.round(((float)count*100)/(s.length()));
    }
}
