package solution.leetcode;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()")); // true
        System.out.println(vp.isValid("()[]{}")); // true
        System.out.println(vp.isValid("(]")); // false
        System.out.println(vp.isValid("([)]")); // false
        System.out.println(vp.isValid("{[]}")); // true
    }
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()", "").replace("[]", "").replace("{}","");
        }
        return s.isEmpty();
    }
}
