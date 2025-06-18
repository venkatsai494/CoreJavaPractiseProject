package solution.leetcode;

public class MinimumAddToMakeParenthesesValid {

    public static void main(String[] args) {
        MinimumAddToMakeParenthesesValid solution = new MinimumAddToMakeParenthesesValid();
        System.out.println(solution.minAddToMakeValid("())")); // 1
        System.out.println(solution.minAddToMakeValid("(((")); // 3
        System.out.println(solution.minAddToMakeValid("()")); // 0
        System.out.println(solution.minAddToMakeValid("()))((")); // 4
    }

    public int minAddToMakeValid(String s) {
        int output = 0;
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(')  output++;
            else if(s.charAt(i) == ')') output--;
            if(output<0) {
                count++;
                output = 0;
            }
        }
        return Math.abs(output + count);
    }
}