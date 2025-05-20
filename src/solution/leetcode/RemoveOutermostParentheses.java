package solution.leetcode;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        RemoveOutermostParentheses rop = new RemoveOutermostParentheses();
        System.out.println(rop.removeOuterParentheses("(()())(())")); // ()()()
        System.out.println(rop.removeOuterParentheses("(()())(())(()(()))")); // ()()()()(())
        System.out.println(rop.removeOuterParentheses("()()")); // ""
        System.out.println(rop.removeOuterParentheses("((()))")); // ()
        System.out.println(rop.removeOuterParentheses("(((())))")); // (())
    }
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        for(int i = 0; i<s.length(); i++){
            if(temp>=1){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i) == '(') temp++;
            else if(s.charAt(i) == ')') temp--;
            if(temp==0){
                sb.deleteCharAt(sb.length()-1);
            }

        }
        return sb.toString();
    }
}
