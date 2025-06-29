package solution.leetcode;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses mndp = new MaximumNestingDepthOfTheParentheses();
        System.out.println(mndp.maxDepth("(1+(2*3)+((8)/4))+1")); // 3
        System.out.println(mndp.maxDepth("(1)+((2))+(((3)))")); // 3
        System.out.println(mndp.maxDepth("()(())((()()))")); // 3
        System.out.println(mndp.maxDepth("()")); // 1
        System.out.println(mndp.maxDepth("(())")); // 2
        System.out.println(mndp.maxDepth("(()())")); // 2
        System.out.println(mndp.maxDepth("()()")); // 1
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
