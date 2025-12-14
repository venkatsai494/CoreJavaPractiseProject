package solution.leetcode;

public class MinimumTimeToTypeWordUsingSpecialTypewriter {
    public static void main(String[] args) {
        MinimumTimeToTypeWordUsingSpecialTypewriter solution = new MinimumTimeToTypeWordUsingSpecialTypewriter();
        System.out.println(solution.minTimeToType("abc"));
        System.out.println(solution.minTimeToType("bza"));
        System.out.println(solution.minTimeToType("zjpc"));
    }
    public int minTimeToType(String word) {
        int movement = 0;
        char currentChar = 'a';
        for(int i = 0; i<word.length(); i++){
            movement = movement + minMovementsRequiredFromTo(currentChar, word.charAt(i));
            currentChar = word.charAt(i);
        }
        return movement+word.length();
    }

    public int minMovementsRequiredFromTo(char a, char b){
        if(Math.abs(a-b)>13) return 26-Math.abs(a-b);
        else return Math.abs(a-b);
    }
}
