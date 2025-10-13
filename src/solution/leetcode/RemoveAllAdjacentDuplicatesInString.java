package solution.leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString obj = new RemoveAllAdjacentDuplicatesInString();
        System.out.println(obj.removeDuplicates("abbaca")); // "ca"
        System.out.println(obj.removeDuplicates("azxxzy")); // "ay"
        System.out.println(obj.removeDuplicates("a")); // "a"
        System.out.println(obj.removeDuplicates("aa")); // ""
        System.out.println(obj.removeDuplicates("aababaab")); // "ba"
    }
    public String removeDuplicates(String s) {
        if(s.length()==1) return s;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
