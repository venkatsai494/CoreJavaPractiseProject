package solution.leetcode;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses m = new MaximumNestingDepthOfTheParentheses();
        System.out.println(m.maxDepth("(1+(2*3)+((8)/4))+1")); // Output: 3
        System.out.println(m.maxDepth("(1)+((2))+(((3)))")); // Output: 3
        System.out.println(m.maxDepth("1+(2*3)/(2-1)")); // Output: 1
        System.out.println(m.maxDepth("1")); // Output: 0
    }

    public int maxDepth(String s) {
        int result = 0;
        int depth = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(') depth++;
            else if(s.charAt(i) == ')') depth--;
            result = Math.max(result, depth);
        }
        return result;
    }
}
